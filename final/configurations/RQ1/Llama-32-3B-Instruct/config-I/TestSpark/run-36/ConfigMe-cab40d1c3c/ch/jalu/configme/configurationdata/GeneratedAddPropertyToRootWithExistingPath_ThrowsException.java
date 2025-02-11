package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedAddPropertyToRootWithExistingPath_ThrowsException {

    @Test
    public void addPropertyToRootWithExistingPath_ThrowsException() {
        Property<?> property = new Property<>("DataSource.mysql");
        PropertyListBuilder builder = new PropertyListBuilder();
        try {
            builder.add(property);
            fail("Expected ConfigMeException to be thrown");
        } catch (ConfigMeException e) {
            assertEquals("Path at '" + property.getPath() + "' already exists", e.getMessage());
        }
    }

}