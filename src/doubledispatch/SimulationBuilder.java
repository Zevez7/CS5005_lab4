package doubledispatch;

import java.util.ArrayList;
import java.util.List;

public class SimulationBuilder {

  private static List<String> Log;

  public SimulationBuilder() {
    Log = new ArrayList<String>();
  }

  public static IPlanet createPlanet(String name) {

    if (name.equalsIgnoreCase("mars")) {
      System.out.println("create mars");
      return new Mars();
    } else if (name.equalsIgnoreCase("mercury")) {
      System.out.println("create mercury");

      return new Mercury();
    } else if (name.equalsIgnoreCase("venus")) {
      System.out.println("create venus");
      return new Venus();
    } else {
      return null;
    }
  }


  public static ISpaceExplorer createExplorer(String name) {

    if (name.equalsIgnoreCase("LifeExplorer")) {
      return new LifeExplorer();
    } else if (name.equalsIgnoreCase("TerrainExplorer")) {
      return new TerrainExplorer();
    } else {
      return null;
    }
  }

  public static void addToLog(String message) {
    Log.add(message);
  }

  public static List<String> getSimulationLog() {
    System.out.print(Log);
    return Log;
  }


//  public static void main(String[] args) {
//
//    SimulationBuilder Sim1 = new SimulationBuilder();
//    ISpaceExplorer lifeExp = createExplorer("LifeExplorer");
//    ISpaceExplorer terrainExp = createExplorer("TerrainExplorer");
//
//    IPlanet marsPlanet = createPlanet("mars");
//    IPlanet venusPlanet = createPlanet("venus");
//    IPlanet jupiterPlanet = createPlanet("jupiter");
////    assert jupiterPlanet != null;
////    jupiterPlanet.accept(lifeExp);
//    assert marsPlanet != null;
//    marsPlanet.accept(lifeExp);
//    assert venusPlanet != null;
//    venusPlanet.accept(terrainExp);
//    assert lifeExp != null;
//    lifeExp.visit((Mars) marsPlanet);
//    lifeExp.visit((Venus) venusPlanet);
//    lifeExp.visit( (IPlanet) jupiterPlanet);
//    List<String> log1 = getSimulationLog();
////    System.out.println(log1);
//  }


}


