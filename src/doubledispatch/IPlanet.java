package doubledispatch;


/**
 * Interface for IPlant with accept method.
 */
public interface IPlanet {

  /**
   * Accept method which accept an ISpaceExplorer for the planet.
   * @param explorer  the ISpaceExplorer for the planet.
   */
  void accept(ISpaceExplorer explorer);
}
