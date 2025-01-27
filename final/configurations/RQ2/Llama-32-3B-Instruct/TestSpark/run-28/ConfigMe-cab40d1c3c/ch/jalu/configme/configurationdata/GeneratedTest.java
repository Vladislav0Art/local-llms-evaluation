package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void addProperty_NoProperties_ReturnsEmptyList() {
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> result = builder.create();
        assertEquals(0, result.size());
    }

    @Test
    public void addProperty_AddingOneProperty_ReturnsWithOneProperty() {
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        builder.addProperty(property);
        List<Property<?>> result = builder.create();
        assertTrue(result.size() > 0);
    }

    @Test
    public void addProperty_AddingMultipleProperties_ReturnsWithMultipleProperties() {
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property1 = Mockito.mock(Property.class);
        Property<?> property2 = Mockito.mock(Property.class);
        builder.addProperty(property1);
        builder.addProperty(property2);
        List<Property<?>> result = builder.create();
        assertTrue(result.size() > 1);
    }

    @Test
    public void addProperty_ThrowsExceptionWhenAddingNullProperty() {
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        expectThrow(ConfigMeException.class, () -> builder.addProperty(null));
    }

    @Test
    public void createMethod_ReturnsEmptyList_WhenNoPropertiesAdded() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> result = builder.create();
        assertTrue(result.size() == 0);
    }

    @Test
    public void createMethod_ReturnsCreatedProperties() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property1 = Mockito.mock(Property.class);
        Property<?> property2 = Mockito.mock(Property.class);
        builder.addProperty(property1);
        builder.addProperty(property2);
        List<Property<?>> result = builder.create();
        assertEquals(2, result.size());
    }

    @Test
    public void createMethod_ReturnsPropertiesInCorrectOrder() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property1 = Mockito.mock(Property.class);
        Property<?> property2 = Mockito.mock(Property.class);
        builder.addProperty(property1);
        builder.addProperty(property2);
        List<Property<?>> result = builder.create();
        assertEquals(Arrays.asList(property2, property1), result);
    }

    @Test
    public void getRootEntries_ReturnsEmptyMap_WhenNoPropertiesAdded() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertTrue(rootEntries.size() == 0);
    }

    @Test
    public void getRootEntries_ReturnsCreatedPropertiesInCorrectFormat() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property1 = Mockito.mock(Property.class);
        Property<?> property2 = Mockito.mock(Property.class);
        builder.addProperty(property1);
        builder.addProperty(property2);
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertEquals(Arrays.asList("property1", "property2"), rootEntries.keySet());
    }

}