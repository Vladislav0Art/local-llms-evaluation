package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import ch.jalu.configme.exception.ConfigMeException;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        assertThrows(IllegalArgumentException.class, () -> {
            propertyListBuilder.add(null);
        });
    }

    @Test
    public void addValidPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getName()).thenReturn("testProp");

        propertyListBuilder.add(mockProperty);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        Assert.assertTrue(rootEntries.containsKey("testProp"));
    }

    @Test
    public void createEmptyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> propertyList = propertyListBuilder.create();
        Assert.assertTrue(propertyList.isEmpty());
    }

    @Test
    public void createNonEmptyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getName()).thenReturn("testProp");

        propertyListBuilder.add(mockProperty);

        List<Property<?>> propertyList = propertyListBuilder.create();
        Assert.assertFalse(propertyList.isEmpty());
        assertEquals(1, propertyList.size());
        Assert.assertEquals(mockProperty, propertyList.get(0));
    }

    @Test
    public void getRootEntriesEmptyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        Assert.assertTrue(rootEntries.isEmpty());
    }

    @Test
    public void getRootEntriesNonEmptyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getName()).thenReturn("testProp");

        propertyListBuilder.add(mockProperty);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        assertEquals(1, rootEntries.size());
    }

}