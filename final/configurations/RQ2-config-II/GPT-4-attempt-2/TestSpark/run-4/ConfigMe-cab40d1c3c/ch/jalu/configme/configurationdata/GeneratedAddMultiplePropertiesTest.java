package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAddMultiplePropertiesTest {

    @Test
    public void addMultiplePropertiesTest() {
        Property<?> mockProperty1 = mock(Property.class);
        Property<?> mockProperty2 = mock(Property.class);
        Property<?> mockProperty3 = mock(Property.class);

        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(mockProperty1);
        builder.add(mockProperty2);
        builder.add(mockProperty3);

        List<Property<?>> result = builder.create();

        assertEquals(3, result.size());
        assertTrue(result.contains(mockProperty1));
        assertTrue(result.contains(mockProperty2));
        assertTrue(result.contains(mockProperty3));
    }

}