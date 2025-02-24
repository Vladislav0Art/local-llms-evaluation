package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertTrue;

import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestAddProperty {

    @Test
    public void testAddProperty() {
        Property<?> mockProperty = Mockito.mock(Property.class);
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(mockProperty);
        assertTrue(propertyListBuilder.create().contains(mockProperty));
    }

}