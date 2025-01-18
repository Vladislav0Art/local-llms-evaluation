package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        Property<?> mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.path");
        propertyListBuilder.add(mockProperty);

        List<Property<?>> propertyList = propertyListBuilder.create();

        assertFalse(propertyList.isEmpty());
        assertEquals("test.path", propertyList.get(0).getPath());
    }

}