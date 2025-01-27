package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class GeneratedTest {

    @Test
    public void addProperty_NoErrorTest() {
        // Arrange
        List<Property<?>> properties = new ArrayList<>();
        Property<?> property = new Property<>("test", "value");
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        builder.add(property);

        // Assert
        assertEquals(1, builder.create().size());
    }

    @Test
    public void addRepeatedProperty_NoErrorTest() {
        // Arrange
        List<Property<?>> properties = new ArrayList<>();
        Property<?> property = new Property<>("test", "value");
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        builder.add(property);
        builder.add(property);

        // Assert
        assertEquals(1, builder.create().size());
    }

    @Test
    public void addNullProperty_ThrowsException() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        builder.add(null);
    }

    @Test
    public void createNoProperties_ReturnsEmptyListTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        List<Property<?>> properties = builder.create();

        // Assert
        assertTrue(properties.isEmpty());
    }

    @Test
    public void createWithOneProperty_ReturnsCorrectlyTest() {
        // Arrange
        Property<?> property = new Property<>("test", "value");
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = new ArrayList<>();

        // Act
        builder.add(property);
        properties = builder.create();

        // Assert
        assertEquals(1, properties.size());
    }

    @Test
    public void createWithMultipleProperties_ReturnsCorrectlyTest() {
        // Arrange
        Property<?> property1 = new Property<>("test1", "value1");
        Property<?> property2 = new Property<>("test2", "value2");
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        builder.add(property1);
        builder.add(property2);
        properties = builder.create();

        // Assert
        assertEquals(2, properties.size());
    }

    @Test
    public void getRootEntries_NoProperty_ReturnsEmptyMapTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> rootEntries = builder.getRootEntries();

        // Act
        assertEquals(0, rootEntries.size());
    }

    @Test
    public void getRootEntriesWithOneProperty_ReturnsCorrectlyTest() {
        // Arrange
        Property<?> property = new Property<>("test", "value");
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        builder.add(property);
        rootEntries = builder.getRootEntries();

        // Assert
        assertEquals(1, rootEntries.size());
    }

    @Test
    public void getRootEntriesWithMultipleProperties_ReturnsCorrectlyTest() {
        // Arrange
        Property<?> property1 = new Property<>("test1", "value1");
        Property<?> property2 = new Property<>("test2", "value2");
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        builder.add(property1);
        builder.add(property2);
        rootEntries = builder.getRootEntries();

        // Assert
        assertEquals(2, rootEntries.size());
    }

}