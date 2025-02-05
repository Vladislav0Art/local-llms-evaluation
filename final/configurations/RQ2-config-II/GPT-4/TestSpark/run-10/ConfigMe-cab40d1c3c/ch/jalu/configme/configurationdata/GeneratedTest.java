package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addPropertySuccessfullyTest() {
        Property<Object> mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.path");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(mockProperty);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertTrue(rootEntries.containsKey("test.path"));
    }

    @Test
    public void addPropertyWithDuplicatePathFailsTest() {
        Property<Object> mockProperty1 = Mockito.mock(Property.class);
        Mockito.when(mockProperty1.getPath()).thenReturn("test.path");

        Property<Object> mockProperty2 = Mockito.mock(Property.class);
        Mockito.when(mockProperty2.getPath()).thenReturn("test.path");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(mockProperty1);
        propertyListBuilder.add(mockProperty2);
    }

    @Test
    public void createEmptyListWhenNoPropertiesAddedTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        List<Property<?>> propertyList = propertyListBuilder.create();
        assertTrue(propertyList.isEmpty());
    }

    @Test
    public void createNonEmptyListWhenPropertiesAddedTest() {
        Property<Object> mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.path");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(mockProperty);

        List<Property<?>> propertyList = propertyListBuilder.create();
        assertFalse(propertyList.isEmpty());
    }

    @Test
    public void getRootEntriesReturnsCorrectMapTest() {
        Property<Object> mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test");
        Mockito.when(mockProperty.getDefaultValue()).thenReturn("path");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(mockProperty);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertEquals("path", rootEntries.get("test"));
    }

}