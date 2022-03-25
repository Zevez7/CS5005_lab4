package doubledispatch;

/**
 * Interface for ISpaceExplorer with 3 method and one default aPlanet method.
 */
public interface ISpaceExplorer {

  /**
   * Visit method for SpaceExplorer to visit the planet.
   * @param mercury a planet  class.
   */
  void visit(Mercury mercury);

  /**
   * Visit method for SpaceExplorer to visit the planet.
   * @param mars a planet.
   */
  void visit(Mars mars);

  /**
   * Visit method for SpaceExplorer to visit the planet.
   * @param venus a planet.
   */
  void visit(Venus venus);


  /**
   * Visit method for SpaceExplorer to visit an unknown planet.
   * @param aPlanet a planet.
   */
  default void visit(IPlanet aPlanet) {
    SimulationBuilder.addToLog("Visiting an unknown planet");
  }
}