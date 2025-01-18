package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Map;

public class GeneratedCreateReturnsCorrectListMultiplePropertiesAddedTest {

    @Test
    public void createReturnsCorrectListMultiplePropertiesAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> mockProperty1 = Mockito.mock(Property.class);
        Property<?> mockProperty2 = Mockito.mock(Property.class);

        builder.add(mockProperty1);
        builder.add(mockProperty2);

        List<Property<?>> properties = builder.create();
        assertNotNull(properties);
        assertEquals(2, properties.size());
        assertTrue(properties.contains(mockProperty1));
        assertTrue(properties.contains(mockProperty2));
    }

}