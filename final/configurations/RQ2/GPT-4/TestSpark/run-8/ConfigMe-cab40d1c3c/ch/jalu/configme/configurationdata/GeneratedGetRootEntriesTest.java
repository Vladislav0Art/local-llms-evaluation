package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedGetRootEntriesTest {

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        Property<?> mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.path");

        propertyListBuilder.add(mockProperty);
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        assertTrue(rootEntries.containsKey("test"));
    }

}