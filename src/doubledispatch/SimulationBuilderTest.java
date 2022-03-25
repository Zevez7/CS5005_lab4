package doubledispatch;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SimulationBuilderTest {

  @Before
  public void setUp() throws Exception {
  }


  @Test
  public void testSimulation() {


    SimulationBuilder Sim1 = new SimulationBuilder();
    ISpaceExplorer lifeExp = SimulationBuilder.createExplorer("LifeExplorer");
    ISpaceExplorer terrainExp = SimulationBuilder.createExplorer("TerrainExplorer");

    IPlanet marsPlanet = SimulationBuilder.createPlanet("mars");
    marsPlanet.accept(lifeExp);
    List<String> log1 = Sim1.getSimulationLog();
    assert lifeExp != null;
    lifeExp.visit(marsPlanet);

//    SimulationBuilder.Log;
//    SimulationBuilder.addToLog("Hello");
//    SimulationBuilder.getSimulationLog();

  }

}