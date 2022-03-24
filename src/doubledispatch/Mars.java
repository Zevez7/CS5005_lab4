package doubledispatch;

public class Mars implements IPlanet {

  @Override
  public void accept(ISpaceExplorer explorer) {
    System.out.print("mars accepted explorer");
  }
}
