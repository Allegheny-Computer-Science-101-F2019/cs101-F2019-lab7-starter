package labseven.experiment;

import labseven.computation.ArithmeticComputation;
import labseven.data.ResultsTable;

import java.util.Random;

/**
 * A RunCampaign class that can run an experiment with a computer.
 *
 * @author Gregory M. Kapfhammer
 */

public class RunCampaign implements Campaign {

  /** The starting size for running an experiment campaign. */
  private static final int INPUT_SIZE_START = 1;

  /** The growth factor for input when running an experiment campaign. */
  private static final int INPUT_GROWTH_FACTOR = 2;

  /** The indentation level for the output. */
  private static final String IDENTATION = "  ";

  /** Run a provided ArithmeticComputation in an experiment campaign for specified rounds. */
  public ResultsTable run(ArithmeticComputation compute, int campaignLength) {
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    ResultsTable results = new ResultsTable(campaignLength);
    System.out.println("Starting a campaign of experiments with " + compute.getName() + " ...");
    // run a campaign for all of the the required rounds. Note that this might not be
    // the most principled way to run the experiments because this does not precisely
    // double the size of the _input_ and instead doubles its magnitude (see the green
    // theory of computation book for more details about this relevant issue).
    while (campaignRound < campaignLength) {
      long timeBefore = System.currentTimeMillis();
      compute.compute(currentInputSize);
      long timeAfter = System.currentTimeMillis();
      long timeElapsed = timeAfter - timeBefore;
      results.addResult((long)currentInputSize, timeElapsed);
      System.out.println(IDENTATION + "Running round " + campaignRound
          + " with input size " + currentInputSize);
      currentInputSize = currentInputSize * INPUT_GROWTH_FACTOR;
      campaignRound++;
    }
    System.out.println("... Finishing a campaign of experiments with " + compute.getName());
    return results;
  }

}
