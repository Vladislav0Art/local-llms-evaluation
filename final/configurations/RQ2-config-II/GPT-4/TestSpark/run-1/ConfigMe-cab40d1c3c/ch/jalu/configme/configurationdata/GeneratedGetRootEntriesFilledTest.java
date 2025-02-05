package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesFilledTest {

    @Test
    public void getRootEntriesFilledTest() {
        Property mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("testPath");
        when(mockProperty.getDefaultValue()).thenReturn("testValue");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(mockProperty);
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertEquals(1, rootEntries.size());
        assertTrue(rootEntries.containsKey("testPath"));
    }

}