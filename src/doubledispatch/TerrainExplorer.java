package doubledispatch;

public class TerrainExplorer implements ISpaceExplorer{

  @Override
  public void visit(Mercury mercury) {

  }

  @Override
  public void visit(Mars mars) {

  }

  @Override
  public void visit(Venus venus) {

  }

  @Override
  public void visit(IPlanet aPlanet) {
    ISpaceExplorer.super.visit(aPlanet);
  }
}
