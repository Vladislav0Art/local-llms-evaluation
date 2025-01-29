package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestAddMultipleProperties {

    private PropertyListBuilder propertyListBuilder;

    @BeforeEach
    public void init() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testAddMultipleProperties() {
        // Arrange
        List<Property<?>> properties = new ArrayList<>();
        properties.add(new Property<>(propertyName1, "testValue"));
        properties.add(new Property<>(propertyName2, "testValue"));

        // Act and Assert
        List<Property<?>> result = propertyListBuilder.create();
        assertEquals(2, result.size());
    }

}