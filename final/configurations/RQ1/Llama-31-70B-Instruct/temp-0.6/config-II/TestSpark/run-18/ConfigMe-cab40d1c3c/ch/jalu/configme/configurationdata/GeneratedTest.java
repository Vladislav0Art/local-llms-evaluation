package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void addShouldAddProperty() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new Property<>("test.path", String.class);

        // Act
        builder.add(property);

        // Assert
        assertTrue(builder.getRootEntries().containsKey("test"));
        assertTrue(((Map<?, ?>) builder.getRootEntries().get("test")).containsKey("path"));
        assertEquals(property, ((Map<?, ?>) builder.getRootEntries().get("test")).get("path"));
    }

    @Test
    public void addShouldThrowExceptionWhenPropertyAlreadyExists() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new Property<>("test.path", String.class);
        builder.add(property);

        // Act
        builder.add(property);
    }

}