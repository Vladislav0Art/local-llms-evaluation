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

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @BeforeEach
    public void init() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testAddProperty_ThrowsExceptionWhenPropertyIsNull() {
        // Arrange
        String propertyName = "testProperty";

        // Act and Assert
        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(null));
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

    @Test
    public void testCreateReturnsEmptyList() {
        // Arrange
        List<Property<?>> properties = new ArrayList<>();

        // Act and Assert
        List<Property<?>> result = propertyListBuilder.create();
        assertEquals(0, result.size());
    }

    @Test
    public void testGetRootEntriesReturnRootEntriesMap() {
        // Arrange
        Map<String, Object> expectedRootEntries = new LinkedHashMap<>();
        expectedRootEntries.put("property1", "value1");
        expectedRootEntries.put("property2", "value2");

        // Act and Assert
        Map<String, Object> result = propertyListBuilder.getRootEntries();
        assertEquals(expectedRootEntries, result);
    }

    @Test
    public void testAddProperty_ThrowsExceptionWhenAddingDuplicateProperties() {
        // Arrange
        List<Property<?>> properties = new ArrayList<>();
        properties.add(new Property<>(propertyName, "testValue"));
        properties.add(new Property<>(propertyName, "anotherTestValue"));

        // Act and Assert
        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(properties));
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