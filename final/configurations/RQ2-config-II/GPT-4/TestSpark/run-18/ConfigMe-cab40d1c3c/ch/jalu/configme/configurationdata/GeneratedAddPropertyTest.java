package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property property = mock(Property.class);
        when(property.getPath()).thenReturn("property.path");

        listBuilder.add(property);

        List<Property<?>> properties = listBuilder.create();

        assertEquals(1, properties.size());
        assertEquals(property, properties.get(0));
    }

}