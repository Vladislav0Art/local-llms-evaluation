package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedTestAdd_validProperty_addsProperty {

    @Test
    public void testAdd_validProperty_addsProperty() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new Property<>("test.path", "description", String.class);

        // Act
        builder.add(property);

        // Assert
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertNotNull(rootEntries.get("test"));
        assertNotNull(((Map<String, Object>) rootEntries.get("test")).get("path"));
        assertEquals(property, ((Map<String, Object>) rootEntries.get("test")).get("path"));
    }

}