package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetRootEntriesAfterAddingPropertiesTest {

    @Test
    public void getRootEntriesAfterAddingPropertiesTest() {
        Property<?> mockProperty1 = mock(Property.class);
        when(mockProperty1.getPath()).thenReturn("prop1");
        Property<?> mockProperty2 = mock(Property.class);
        when(mockProperty2.getPath()).thenReturn("prop2");
        Property<?> mockProperty3 = mock(Property.class);
        when(mockProperty3.getPath()).thenReturn("prop3");

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(mockProperty1);
        builder.add(mockProperty2);
        builder.add(mockProperty3);

        Map<String, Object> result = builder.getRootEntries();

        assertEquals(3, result.size());
        assertTrue(result.containsKey("prop1"));
        assertTrue(result.containsKey("prop2"));
        assertTrue(result.containsKey("prop3"));
    }

}