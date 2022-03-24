package doubledispatch;

public class Mercury implements IPlanet {

  @Override
  public void accept(ISpaceExplorer explorer) {
    System.out.print("mercury accepted explorer");

  }
}
