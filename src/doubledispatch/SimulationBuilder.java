package doubledispatch;

import java.util.List;

public class SimulationBuilder {

  public static List<String> Log;

  public static IPlanet createPlanet(String name) {

    if (name == "mars") {
      System.out.println("create mars");
      return new Mars();
    } else if (name == "mercury") {
      System.out.println("create mercury");

      return new Mercury();
    } else if (name == "venus") {
      System.out.println("create venus");
      return new Venus();
    } else {
      return null;
    }
  }


  public static ISpaceExplorer createExplorer(String name) {

    if (name == "LifeExplorer") {
      return new LifeExplorer();
    } else if (name == "TerrainExplorer") {
      return new TerrainExplorer();
    } else {
      return null;
    }
  }

  public static void addToLog(String message) {
    Log.add(message);
  }

  public static List<String> getSimulationLog() {
    return Log;
  }


}


