import org.example.Coordinates;
import org.example.impl.LightGridImpl;
import org.example.impl.LightGridWithBrightnessImpl;
import org.example.impl.LightWithBrightnessImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LightGridWithBrightnessImplTest {

    LightGridWithBrightnessImpl lightGrid;

    @BeforeEach
    void setup(){
        lightGrid = new LightGridWithBrightnessImpl();

    }
    @Test
    void testInitialGridState(){
        LightWithBrightnessImpl currentLight;
        for (int i = 0; i < lightGrid.getMaxRows(); i++) {
            for (int j = 0; j < lightGrid.getMaxCols(); j++) {
                currentLight = (LightWithBrightnessImpl) lightGrid.getLights()[i][j];
                Assertions.assertNotNull(currentLight);
                Assertions.assertEquals(0,currentLight.getBrightness());
            }
        }
    }

    @Test
    void testTurnOnGrid(){
        Coordinates c1 = new Coordinates(0,0);
        Coordinates c2 = new Coordinates(1,1);
        lightGrid.turnOnGrid(c1, c2);
        Assertions.assertEquals(4, lightGrid.countLitLights());
    }

    @Test
    void testTurnOffGridInitially(){
        Coordinates c1 = new Coordinates(0,0);
        Coordinates c2 = new Coordinates(1,1);
        lightGrid.turnOffGrid(c1, c2);
        Assertions.assertEquals(0, lightGrid.countLitLights());
    }

    @Test
    void testTurnOffGridAfterTurningOn(){
        Coordinates c1 = new Coordinates(0,0);
        Coordinates c2 = new Coordinates(1,1);
        int currentCount = lightGrid.countLitLights();
        lightGrid.turnOnGrid(c1,c2);
        lightGrid.turnOffGrid(c1, c2);
        Assertions.assertEquals(currentCount, lightGrid.countLitLights());
    }
    @Test
    void testToggleGrid(){
        Coordinates c1 = new Coordinates(0,0);
        Coordinates c2 = new Coordinates(1,1);
        lightGrid.toggleGrid(c1,c2);
        Assertions.assertEquals(6, lightGrid.countLitLights());
    }
}
