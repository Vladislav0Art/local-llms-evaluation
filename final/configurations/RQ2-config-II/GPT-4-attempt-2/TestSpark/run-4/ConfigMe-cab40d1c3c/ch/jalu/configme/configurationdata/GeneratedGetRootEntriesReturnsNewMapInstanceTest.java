package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetRootEntriesReturnsNewMapInstanceTest {

    @Test
    public void getRootEntriesReturnsNewMapInstanceTest() {
        Property<?> mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("prop");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(mockProperty);

        Map<String, Object> firstResult = builder.getRootEntries();
        Map<String, Object> secondResult = builder.getRootEntries();

        assertNotSame(firstResult, secondResult);
        assertEquals(firstResult, secondResult);
    }

}