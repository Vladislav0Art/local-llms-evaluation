package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<String> mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("test.path");
        listBuilder.add(mockProperty);
        List<Property<?>> propertyList = listBuilder.create();

        assertFalse("Properties List should not be empty", propertyList.isEmpty());
        assertTrue("Properties List should contain added mock property", propertyList.contains(mockProperty));
    }

}