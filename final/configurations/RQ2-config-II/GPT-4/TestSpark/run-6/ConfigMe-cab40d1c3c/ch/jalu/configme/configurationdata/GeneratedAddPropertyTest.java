package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.path");
        Mockito.when(mockProperty.getDefaultValue()).thenReturn("default value");

        propertyListBuilder.add(mockProperty);
        List<Property<?>> list = propertyListBuilder.create();

        assertEquals(1, list.size());
        assertEquals(mockProperty, list.get(0));
    }

}