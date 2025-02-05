package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetRootEntriesNonEmptyListTest {

    @Test
    public void getRootEntriesNonEmptyListTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<String> mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("test.path");
        listBuilder.add(mockProperty);

        assertEquals("Root Entries should have one entry", 1, listBuilder.getRootEntries().size());
    }

}