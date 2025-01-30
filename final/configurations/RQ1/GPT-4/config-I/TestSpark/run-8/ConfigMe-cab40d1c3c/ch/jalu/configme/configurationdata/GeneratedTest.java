package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void addSinglePropertyTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new StringProperty("DataSource.url", "jdbc:mysql://localhost:3306/test");

        // When
        propertyListBuilder.add(property);

        // Then
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertTrue(rootEntries.containsKey("DataSource"));

        Map<String, Object> dataSourceMap = (Map<String, Object>) rootEntries.get("DataSource");
        assertEquals(dataSourceMap.get("url"), property);
    }

    @Test
    public void addDuplicatePropertyTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new StringProperty("DataSource.url", "jdbc:mysql://localhost:3306/test");

        // When
        propertyListBuilder.add(property);
        propertyListBuilder.add(property); // duplicate property
    }

    @Test
    public void createPropertyListTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property1 = new StringProperty("DataSource.url", "jdbc:mysql://localhost:3306/test");
        Property<String> property2 = new StringProperty("DataSource.username", "root");

        // When
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);

        // Then
        List<Property<?>> propertyList = propertyListBuilder.create();
        assertTrue(propertyList.contains(property1));
        assertTrue(propertyList.contains(property2));
    }

    @Test
    public void addPropertyParentPathOverrideTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new StringProperty("DataSource.url", "jdbc:mysql://localhost:3306/test");

        // parent path tries to replace a leaf node, should throw ConfigMeException
        Property<String> propertyOverride = new StringProperty("DataSource", "will not be added");

        // When
        propertyListBuilder.add(property);
        propertyListBuilder.add(propertyOverride); // overriding property
    }

}