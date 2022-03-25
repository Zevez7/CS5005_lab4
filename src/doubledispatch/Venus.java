package doubledispatch;

public class Venus implements IPlanet{

  @Override
  public void accept(ISpaceExplorer explorer) {
    System.out.print("venus accepted explorer \n");

  }
}
