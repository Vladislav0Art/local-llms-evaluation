package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GeneratedGetRootEntriesTest {

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