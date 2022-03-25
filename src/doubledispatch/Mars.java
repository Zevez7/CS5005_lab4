package doubledispatch;

/**
 * Class for planet Mars that implement IPlanet.
 */
public class Mars implements IPlanet {


  /**
   * Accept method which accept an ISpaceExplorer for the planet.
   *
   * @param explorer the ISpaceExplorer for the planet.
   */
  @Override
  public void accept(ISpaceExplorer explorer) {
    explorer.visit(this);

  }
}
