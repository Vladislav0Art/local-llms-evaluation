package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddPropertyNewTest {

    @Test
    public void addPropertyNewTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new Property<>("DataSource.name", "sqlite");

        // Act
        builder.add(property);

        // Assert
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertTrue(rootEntries.get("DataSource") instanceof Map<?, ?>);
        assertEquals(property, ((Map<?, ?>) rootEntries.get("DataSource")).get("name"));
    }

}