package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property property = mock(Property.class);
        when(property.getPath()).thenReturn("property.path");

        listBuilder.add(property);

        List<Property<?>> properties = listBuilder.create();

        assertEquals(1, properties.size());
        assertEquals(property, properties.get(0));
    }

    @Test
    public void addPropertyWithExistingPathTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property property1 = mock(Property.class);
        when(property1.getPath()).thenReturn("property.path");
        Property property2 = mock(Property.class);
        when(property2.getPath()).thenReturn("property.path");

        listBuilder.add(property1);
        listBuilder.add(property2);
    }

    @Test
    public void createEmptyPropertyListTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();

        List<Property<?>> properties = listBuilder.create();

        assertTrue(properties.isEmpty());
    }

    @Test
    public void getRootEntriesEmptyTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();

        assertTrue(listBuilder.getRootEntries().isEmpty());
    }

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property property = mock(Property.class);
        when(property.getPath()).thenReturn("property.path");
        when(property.getDefaultValue()).thenReturn("default.value");

        listBuilder.add(property);

        assertTrue(listBuilder.getRootEntries().containsKey("property.path"));
        assertEquals("default.value", listBuilder.getRootEntries().get("property.path"));
    }

}