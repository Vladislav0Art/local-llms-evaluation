package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateWhenPropertiesAreNotEmptyReturnsCorrectList {

    public static class ConfigMeException extends RuntimeException {
    }

    public void setup() {
        // No setup needed
    }

    @Test
    public void createWhenPropertiesAreNotEmptyReturnsCorrectList() {
        Property<?> property1 = mockProperty();
        Property<?> property2 = mockProperty();
        new PropertyListBuilder().add(property1).add(property2);
        List<Property<?>> result = new PropertyListBuilder().create();
        assertEquals(2, result.size());
    }

}