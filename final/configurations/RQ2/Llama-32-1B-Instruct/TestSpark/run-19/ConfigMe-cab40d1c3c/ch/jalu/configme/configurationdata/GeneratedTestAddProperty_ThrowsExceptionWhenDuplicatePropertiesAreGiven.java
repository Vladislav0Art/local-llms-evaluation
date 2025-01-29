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

public class GeneratedTestAddProperty_ThrowsExceptionWhenDuplicatePropertiesAreGiven {

    private PropertyListBuilder propertyListBuilder;

    @BeforeEach
    public void init() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testAddProperty_ThrowsExceptionWhenDuplicatePropertiesAreGiven() {
        // Arrange
        List<Property<?>> properties = new ArrayList<>();
        properties.add(new Property<>(propertyName, "testValue"));
        properties.add(new Property<>(propertyName, "anotherTestValue"));

        // Act and Assert
        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(properties));
    }

}