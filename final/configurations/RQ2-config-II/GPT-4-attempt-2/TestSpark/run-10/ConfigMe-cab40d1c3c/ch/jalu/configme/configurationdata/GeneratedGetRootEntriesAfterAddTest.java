package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;

public class GeneratedGetRootEntriesAfterAddTest {

    @Test
    public void getRootEntriesAfterAddTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<Integer> mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("Test");
        Mockito.when(mockProperty.getDefaultValue()).thenReturn(12345);
        listBuilder.add(mockProperty);
        assertFalse(listBuilder.getRootEntries().isEmpty());
        assertTrue(listBuilder.getRootEntries().containsKey("Test"));
        assertEquals(12345, listBuilder.getRootEntries().get("Test"));
    }

}