package doubledispatch;


/**
 * Class for LifeExplorer with implementation from ISpaceExplorer. Overload for the different planet.
 */

public  class LifeExplorer implements ISpaceExplorer {
  @Override
  public void visit(Mercury mercury) {
    SimulationBuilder.addToLog("Landing on Mercury...exploring for life");
  }

  @Override
  public void visit(Mars mars) {
    SimulationBuilder.addToLog("Landing on Mars...exploring for life");
  }

  @Override
  public void visit(Venus venus) {
    SimulationBuilder.addToLog("Landing on Venus...exploring life");
  }
  @Override
  public void visit(IPlanet aPlanet) {
    ISpaceExplorer.super.visit(aPlanet);
  }
}