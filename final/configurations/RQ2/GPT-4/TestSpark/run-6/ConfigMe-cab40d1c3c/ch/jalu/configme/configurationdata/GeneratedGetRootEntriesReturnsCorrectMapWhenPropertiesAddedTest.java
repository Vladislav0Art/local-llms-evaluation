package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesReturnsCorrectMapWhenPropertiesAddedTest {

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