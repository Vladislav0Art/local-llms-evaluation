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

public class GeneratedTestAdd_PropertyAdded {

    @Test
    public void testAdd_PropertyAdded() {
        Property<String> property = mock(Property.class);
        when(property.getPath()).thenReturn("test.property");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);

        assertEquals(1, builder.getRootEntries().size());
        assertEquals(property, builder.getRootEntries().get("test").get("property"));
    }

}