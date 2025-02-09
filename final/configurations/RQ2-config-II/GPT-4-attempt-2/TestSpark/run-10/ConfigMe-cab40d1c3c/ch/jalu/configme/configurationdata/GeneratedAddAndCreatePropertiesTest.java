package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;

public class GeneratedAddAndCreatePropertiesTest {

    @Test
    public void addAndCreatePropertiesTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<String> mockProperty1 = Mockito.mock(Property.class);
        Property<Integer> mockProperty2 = Mockito.mock(Property.class);
        listBuilder.add(mockProperty1);
        listBuilder.add(mockProperty2);
        List<Property<?>> properties = listBuilder.create();
        assertEquals(2, properties.size());
        assertTrue(properties.contains(mockProperty1));
        assertTrue(properties.contains(mockProperty2));
    }

}