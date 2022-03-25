package doubledispatch;

public class UnknownPlanet implements IPlanet {

  @Override
  public void accept(ISpaceExplorer explorer) {
    System.out.print("unknown planet accepted explorer \n");
  }
}