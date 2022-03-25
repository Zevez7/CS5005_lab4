package doubledispatch;


/**
 * TerrainExplorer class with ISpaceExplorer implementation.
 */
public class TerrainExplorer implements ISpaceExplorer {


  /**
   * Visit the planet and add to the simulationbuilder log a message.
   *
   * @param mercury a planet  class.
   */
  @Override
  public void visit(Mercury mercury) {
    SimulationBuilder.addToLog("Navigating and mapping mercury");
  }

  /**
   * Visit the planet and add to the simulationbuilder log a message.
   *
   * @param mars planet class.
   */
  @Override
  public void visit(Mars mars) {
    SimulationBuilder.addToLog("Navigating and mapping mars");
  }

  /**
   * Visit the planet and add to the simulationbuilder log a message.
   *
   * @param venus a planet class.
   */
  @Override
  public void visit(Venus venus) {
    SimulationBuilder.addToLog("Navigating and mapping venus");
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