package doubledispatch;

import java.util.ArrayList;
import java.util.List;

/**
 * Simulation builder factory for both createPlanet and createExplorer class.
 * Log attribute keep record of methods.
 */
public class SimulationBuilder {

  private static List<String> Log;

  /**
   * Constructor creates a log new ArrayList.
   */
  public SimulationBuilder() {
    Log = new ArrayList<>();
  }

  /**
   * Method that create a new Planet class instance based on the name parameters.
   * @param name the name of planets
   * @return a new planet class or null if planet is not found.
   */
  public static IPlanet createPlanet(String name) {

    if (name.equalsIgnoreCase("mars")) {
      return new Mars();
    } else if (name.equalsIgnoreCase("mercury")) {
      return new Mercury();
    } else if (name.equalsIgnoreCase("venus")) {
      return new Venus();
    } else {
      return null;
    }
  }

  /**
   * Method to create a new explorer class based on the name parameter.
   * @param name the name of the explorer.
   * @return a new explorer class or null if explorer class is not found.
   */
  public static ISpaceExplorer createExplorer(String name) {

    if (name.equalsIgnoreCase("LifeExplorer")) {
      return new LifeExplorer();
    } else if (name.equalsIgnoreCase("TerrainExplorer")) {
      return new TerrainExplorer();
    } else {
      return null;
    }
  }

  /**
   * Add the message to the log array list.
   * @param message the message to be added to log arraylist.
   */
  public static void addToLog(String message) {
    Log.add(message);
  }

  /**
   * Returns the string arraylist log.
   * @return the string arraylist log.
   */
  public static List<String> getSimulationLog() {
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


