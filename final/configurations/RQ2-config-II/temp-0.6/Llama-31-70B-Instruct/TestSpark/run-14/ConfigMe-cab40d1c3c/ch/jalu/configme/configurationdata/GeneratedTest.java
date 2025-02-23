package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testAdd_PropertyAdded() {
        Property<String> property = mock(Property.class);
        when(property.getPath()).thenReturn("test.property");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);

        assertEquals(1, builder.getRootEntries().size());
        assertEquals(property, builder.getRootEntries().get("test").get("property"));
    }

    @Test
    public void testAdd_PropertyAlreadyExists() {
        Property<String> property1 = mock(Property.class);
        when(property1.getPath()).thenReturn("test.property");

        Property<String> property2 = mock(Property.class);
        when(property2.getPath()).thenReturn("test.property");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property1);

        assertThrows(ConfigMeException.class, () -> builder.add(property2));
    }

    @Test
    public void testAdd_PropertyWithIncorrectPath() {
        Property<String> property = mock(Property.class);
        when(property.getPath()).thenReturn("test");

        PropertyListBuilder builder = new PropertyListBuilder();

        assertThrows(ConfigMeException.class, () -> builder.add(property));
    }

}