package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedCreateProperties_WithNestedMap_ThrowsConfigMeException {

    @Test
    public void createProperties_WithNestedMap_ThrowsConfigMeException() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> map = new LinkedHashMap<>();
        builder.add(new Property<>("a", 1));
        builder.add(new Property<>("b", 2));
        map.put("c", 3);
        try {
            builder.add(new Property<>("d", 4));
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            assertEquals("Value of unknown type found at '" + "d" + "': 4", e.getMessage());
        }
    }

}