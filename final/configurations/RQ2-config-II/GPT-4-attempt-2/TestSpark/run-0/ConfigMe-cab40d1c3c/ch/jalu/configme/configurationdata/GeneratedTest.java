package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

public class GeneratedTest {

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(null);
    }

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<Object> mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.path");
        Mockito.when(mockProperty.getDefaultValue()).thenReturn("test.default");
        propertyListBuilder.add(mockProperty);
        List<Property<?>> propertyList = propertyListBuilder.create();
        assertEquals(1, propertyList.size());
        assertEquals("test.path", propertyList.get(0).getPath());
        assertEquals("test.default", propertyList.get(0).getDefaultValue());
    }

    @Test
    public void createEmptyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> propertyList = propertyListBuilder.create();
        assertTrue(propertyList.isEmpty());
    }

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<Object> mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.path");
        Mockito.when(mockProperty.getDefaultValue()).thenReturn("test.default");
        propertyListBuilder.add(mockProperty);
        assertEquals("test.default", propertyListBuilder.getRootEntries().get("test.path"));
    }

}