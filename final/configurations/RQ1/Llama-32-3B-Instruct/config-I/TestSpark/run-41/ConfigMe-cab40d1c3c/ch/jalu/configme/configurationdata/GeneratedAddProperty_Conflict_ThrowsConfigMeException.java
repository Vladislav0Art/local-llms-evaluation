package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedAddProperty_Conflict_ThrowsConfigMeException {

    @Test
    public void addProperty_Conflict_ThrowsConfigMeException() {
        Property<?> property = new Property<>("DataSource", "mysql");
        new PropertyListBuilder().add(property);
        try {
            new PropertyListBuilder().add(new Property<>("DataSource", "mysql"));
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            assertEquals("Path at '" + property.getPath() + "' already exists", e.getMessage());
        }
    }

}