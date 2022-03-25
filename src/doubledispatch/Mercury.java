package doubledispatch;

/**
 * Class for planet mercury that implement IPlanet.
 */
public class Mercury implements IPlanet {

  /**
   * Accept method which accept an ISpaceExplorer for the planet.
   *
   * @param explorer the ISpaceExplorer for the planet.
   */
  @Override
  public void accept(ISpaceExplorer explorer) {
    System.out.print("mercury accepted explorer \n");

  }
}
