import org.example.impl.LightImpl;
import org.example.impl.LightWithBrightnessImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LightWithBrightnessImplTest {

    LightWithBrightnessImpl light;
    @BeforeEach
    void setup(){
        light = new LightWithBrightnessImpl();
    }
    @Test
    void testLightInitialBrightness(){
        Assertions.assertEquals(0,light.getBrightness());
    }

    @Test
    void testLightTurnOn(){
        int brightnessBeforeTurnOn = light.getBrightness();
        light.turnOn();
        Assertions.assertEquals(brightnessBeforeTurnOn+1, light.getBrightness());
    }
    @Test
    void testLightTurnOffInitiallyWhenAlreadyOff(){
        light.turnOff();
        Assertions.assertEquals(0, light.getBrightness());
    }

    @Test
    void testLightTurnOff(){
        light.turnOn();
        int brightnessBeforeTurnOff = light.getBrightness();
        light.turnOff();
        Assertions.assertEquals(brightnessBeforeTurnOff - 1, light.getBrightness());
    }

    @Test
    void testLightToggle() {
        int brightnessBeforeToggle = light.getBrightness();
        light.toggle();
        Assertions.assertEquals(brightnessBeforeToggle + 2, light.getBrightness());
    }
}
