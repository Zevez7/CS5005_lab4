package doubledispatch;


/**
 * Class for LifeExplorer with implementation from ISpaceExplorer. Overload for the different
 * planet.
 */

public class LifeExplorer implements ISpaceExplorer {

  /**
   * Visit the planet and add to the simulationbuilder log a message.
   *
   * @param mercury a planet  class.
   */
  @Override
  public void visit(Mercury mercury) {
    SimulationBuilder.addToLog("Landing on Mercury...exploring for life");
  }

  /**
   * Visit the planet and add to the simulationbuilder log a message.
   *
   * @param mars planet class.
   */
  @Override
  public void visit(Mars mars) {
    SimulationBuilder.addToLog("Landing on Mars...exploring for life");
  }

  /**
   * Visit the planet and add to the simulationbuilder log a message.
   *
   * @param venus a planet class.
   */
  @Override
  public void visit(Venus venus) {
    SimulationBuilder.addToLog("Landing on Venus...exploring life");
  }

  /**
   * Visit the planet and add to the simulationbuilder log a message.
   *
   * @param aPlanet a planet class.
   */
  @Override
  public void visit(IPlanet aPlanet) {
    ISpaceExplorer.super.visit(aPlanet);
  }
}