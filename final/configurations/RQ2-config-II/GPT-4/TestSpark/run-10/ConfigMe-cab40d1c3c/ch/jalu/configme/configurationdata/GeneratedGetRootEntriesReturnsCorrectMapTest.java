package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedGetRootEntriesReturnsCorrectMapTest {

    @Test
    public void getRootEntriesReturnsCorrectMapTest() {
        Property<Object> mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test");
        Mockito.when(mockProperty.getDefaultValue()).thenReturn("path");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(mockProperty);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertEquals("path", rootEntries.get("test"));
    }

}