package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.add");
        builder.add(mockProperty);
        assertTrue(builder.getRootEntries().containsKey("test.add"));
    }

    @Test
    public void addExistingPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.add");
        builder.add(mockProperty);

        try {
            builder.add(mockProperty);
            fail("Expected an ConfigMeException to be thrown");
        } catch (ConfigMeException e) {
            assertEquals("Property 'test.add' has already been added", e.getMessage());
        }
    }

    @Test
    public void createEmptyListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        assertTrue(properties.isEmpty());
    }

    @Test
    public void createNonEmptyListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.add");
        builder.add(mockProperty);
        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertEquals(mockProperty, properties.get(0));
    }

    @Test
    public void getRootEntriesEmptyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        assertTrue(builder.getRootEntries().isEmpty());
    }

    @Test
    public void getRootEntriesNonEmptyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.add");
        builder.add(mockProperty);
        assertEquals(1, builder.getRootEntries().size());
        assertTrue(builder.getRootEntries().containsKey("test.add"));
    }

}