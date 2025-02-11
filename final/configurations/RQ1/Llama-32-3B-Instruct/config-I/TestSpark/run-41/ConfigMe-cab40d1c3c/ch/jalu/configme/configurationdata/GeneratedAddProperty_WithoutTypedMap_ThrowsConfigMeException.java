package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedAddProperty_WithoutTypedMap_ThrowsConfigMeException {

    @Test
    public void addProperty_WithoutTypedMap_ThrowsConfigMeException() {
        PropertyListBuilder builder = new PropertyListBuilder();
        try {
            builder.add(new Property<>("a", 1));
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            assertEquals("Value of unknown type found at '" + "a" + "': 1", e.getMessage());
        }
    }

}