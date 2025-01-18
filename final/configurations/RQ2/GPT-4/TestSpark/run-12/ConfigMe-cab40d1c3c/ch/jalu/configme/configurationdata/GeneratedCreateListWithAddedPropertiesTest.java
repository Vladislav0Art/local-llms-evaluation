package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Map;

public class GeneratedCreateListWithAddedPropertiesTest {

    @Test
    public void createListWithAddedPropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = mock(Property.class);
        propertyListBuilder.add(mockProperty);

        List<Property<?>> properties = propertyListBuilder.create();

        assertNotNull(properties);
        assertFalse(properties.isEmpty());
        assertEquals(1, properties.size());
    }

}