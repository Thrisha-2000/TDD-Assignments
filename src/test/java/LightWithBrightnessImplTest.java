import org.example.impl.LightImpl;
import org.example.impl.LightWithBrightnessImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LightWithBrightnessImplTest {
    @Test
    void testLightInitialBrightness(){
        LightWithBrightnessImpl light = new LightWithBrightnessImpl();
        Assertions.assertEquals(0,light.getBrightness());
    }

    @Test
    void testLightTurnOn(){
        LightWithBrightnessImpl light = new LightWithBrightnessImpl();
        int brightnessBeforeTurnOn = light.getBrightness();
        light.turnOn();
        Assertions.assertEquals(brightnessBeforeTurnOn+1, light.getBrightness());
    }
    @Test
    void testLightTurnOffInitiallyWhenAlreadyOff(){
        LightWithBrightnessImpl light = new LightWithBrightnessImpl();
        light.turnOff();
        Assertions.assertEquals(0, light.getBrightness());
    }

    @Test
    void testLightTurnOff(){
        LightWithBrightnessImpl light = new LightWithBrightnessImpl();
        light.turnOn();
        int brightnessBeforeTurnOff = light.getBrightness();
        light.turnOff();
        Assertions.assertEquals(brightnessBeforeTurnOff - 1, light.getBrightness());
    }

    @Test
    void testLightToggle() {
        LightWithBrightnessImpl light = new LightWithBrightnessImpl();
        int brightnessBeforeToggle = light.getBrightness();
        light.toggle();
        Assertions.assertEquals(brightnessBeforeToggle + 2, light.getBrightness());

    }
}
