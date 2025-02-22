package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedAdd_validProperty_propertyAdded {

    @Test
    public void add_validProperty_propertyAdded() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<Integer> property = new Property<>("path", 0);

        // Act
        builder.add(property);

        // Assert
        assertTrue(builder.getRootEntries().containsKey("path"));
        assertEquals(property, builder.getRootEntries().get("path"));
    }

}