package doubledispatch;

public class Venus implements IPlanet{

  @Override
  public void accept(ISpaceExplorer explorer) {
    System.out.print("mercury accepted explorer");

  }
}
