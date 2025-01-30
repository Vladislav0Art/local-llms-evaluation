package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    private PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void addPropertyTest() {
        Property<?> property = new StringProperty("DataSource.mysql", "defaultValue");
        builder.add(property);
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertNotNull(rootEntries);
        assertEquals(1, rootEntries.size());
    }

    @Test
    public void addDuplicatePropertyTest() {
        Property<?> property1 = new StringProperty("DataSource.mysql", "defaultValue");
        Property<?> property2 = new StringProperty("DataSource.mysql", "defaultValue");
        builder.add(property1);
        builder.add(property2);
    }

    @Test
    public void groupedPropertyHierarchyTest() {
        Property<?> property1 = new StringProperty("group1.property1", "defaultValue");
        Property<?> property2 = new StringProperty("group1.property2", "defaultValue");
        builder.add(property1);
        builder.add(property2);
        List<Property<?>> properties = builder.create();
        assertEquals(Arrays.asList(property1, property2), properties);
    }

    @Test
    public void overrideStringWithMapTest() {
        Property<?> property1 = new StringProperty("DataSource", "defaultValue");
        Property<?> property2 = new StringProperty("DataSource.mysql", "defaultValue");
        builder.add(property1);
        builder.add(property2);
    }

    @Test
    public void overrideMapWithStringTest() {
        Property<?> property1 = new StringProperty("DataSource.mysql", "defaultValue");
        Property<?> property2 = new StringProperty("DataSource", "defaultValue");
        builder.add(property1);
        builder.add(property2);
    }

    @Test
    public void testCreateNoProperties() {
        List<Property<?>> properties = builder.create();
        assertTrue(properties.isEmpty());
    }

}