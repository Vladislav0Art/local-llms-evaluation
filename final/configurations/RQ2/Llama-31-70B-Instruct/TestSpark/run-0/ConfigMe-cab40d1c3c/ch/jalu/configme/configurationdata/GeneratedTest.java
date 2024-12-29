package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addTest() {
        Property<?> property = mock(Property.class);
        propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);
        assertNotNull(propertyListBuilder.getRootEntries());
    }

    @Test
    public void addTestWithNullProperty() {
        propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(null);
    }

    @Test
    public void createTest() {
        propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> properties = propertyListBuilder.create();
        assertNotNull(properties);
        assertTrue(properties.isEmpty());
    }

    @Test
    public void getRootEntriesTest() {
        propertyListBuilder = new PropertyListBuilder();
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertNotNull(rootEntries);
        assertTrue(rootEntries instanceof LinkedHashMap);
    }

}