import org.example.impl.LightGridWithBrightnessImpl;
import org.example.impl.LightImpl;
import org.example.impl.LightWithBrightnessImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LightGridWithBrightnessImplTest {

    @Test
    void testInitialGridState(){
        LightGridWithBrightnessImpl lightGrid = new LightGridWithBrightnessImpl();
        LightWithBrightnessImpl currentLight;
        for (int i = 0; i < lightGrid.getMaxRows(); i++) {
            for (int j = 0; j < lightGrid.getMaxCols(); j++) {
                currentLight = (LightWithBrightnessImpl) lightGrid.getLights()[i][j];
                Assertions.assertNotNull(currentLight);
                Assertions.assertEquals(0,currentLight.getBrightness());
            }
        }
    }
}
