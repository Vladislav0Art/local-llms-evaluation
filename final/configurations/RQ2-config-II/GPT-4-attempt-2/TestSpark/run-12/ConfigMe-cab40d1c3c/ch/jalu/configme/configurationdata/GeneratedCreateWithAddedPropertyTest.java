package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCreateWithAddedPropertyTest {

    @Test
    public void createWithAddedPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> mockProperty = Mockito.mock(Property.class);
        propertyListBuilder.add(mockProperty);
        List<Property<?>> properties = propertyListBuilder.create();

        assertNotNull(properties);
        assertFalse(properties.isEmpty());
        assertEquals(1, properties.size());
        assertEquals(mockProperty, properties.get(0));
    }

}