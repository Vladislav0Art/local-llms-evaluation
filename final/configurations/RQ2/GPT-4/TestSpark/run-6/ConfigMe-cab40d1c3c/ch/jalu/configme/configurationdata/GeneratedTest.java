package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void addValidPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> mockProperty = Mockito.mock(Property.class);

        try {
            builder.add(mockProperty);
            List<Property<?>> properties = builder.create();
            assertNotNull(properties);
            assertEquals(1, properties.size());
            assertEquals(mockProperty, properties.get(0));
        } catch (Exception e) {
            fail("No exception should have been thrown");
        }
    }

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(null);
    }

    @Test
    public void createReturnsEmptyListWhenNoPropertyAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();

        List<Property<?>> properties = builder.create();
        assertNotNull(properties);
        assertTrue(properties.isEmpty());
    }

    @Test
    public void createReturnsCorrectListMultiplePropertiesAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> mockProperty1 = Mockito.mock(Property.class);
        Property<?> mockProperty2 = Mockito.mock(Property.class);

        builder.add(mockProperty1);
        builder.add(mockProperty2);

        List<Property<?>> properties = builder.create();
        assertNotNull(properties);
        assertEquals(2, properties.size());
        assertTrue(properties.contains(mockProperty1));
        assertTrue(properties.contains(mockProperty2));
    }

    @Test
    public void getRootEntriesIsEmptyWhenNoPropertyAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();

        Map<String, Object> entries = builder.getRootEntries();
        assertNotNull(entries);
        assertTrue(entries.isEmpty());
    }

    @Test
    public void getRootEntriesReturnsCorrectMapWhenPropertiesAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> mockProperty1 = Mockito.mock(Property.class);
        Property<?> mockProperty2 = Mockito.mock(Property.class);
        when(mockProperty1.getPath()).thenReturn("path1");
        when(mockProperty2.getPath()).thenReturn("path2");

        builder.add(mockProperty1);
        builder.add(mockProperty2);

        Map<String, Object> entries = builder.getRootEntries();
        assertNotNull(entries);
        assertEquals(2, entries.size());
        assertTrue(entries.containsKey("path1"));
        assertTrue(entries.containsKey("path2"));
    }

}