package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<String> mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("test.path");
        listBuilder.add(mockProperty);
        List<Property<?>> propertyList = listBuilder.create();

        assertFalse("Properties List should not be empty", propertyList.isEmpty());
        assertTrue("Properties List should contain added mock property", propertyList.contains(mockProperty));
    }

    @Test
    public void addDuplicatePropertyTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<String> mockProperty1 = mock(Property.class);
        Property<String> mockProperty2 = mock(Property.class);
        when(mockProperty1.getPath()).thenReturn("test.path");
        when(mockProperty2.getPath()).thenReturn("test.path");
        listBuilder.add(mockProperty1);
        listBuilder.add(mockProperty2);
    }

    @Test
    public void createEmptyPropertyListTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        List<Property<?>> propertyList = listBuilder.create();

        assertTrue("Properties List should be empty", propertyList.isEmpty());
    }

    @Test
    public void getRootEntriesEmptyListTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();

        assertTrue("Root Entries should be empty", listBuilder.getRootEntries().isEmpty());
    }

    @Test
    public void getRootEntriesNonEmptyListTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<String> mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("test.path");
        listBuilder.add(mockProperty);

        assertEquals("Root Entries should have one entry", 1, listBuilder.getRootEntries().size());
    }

}