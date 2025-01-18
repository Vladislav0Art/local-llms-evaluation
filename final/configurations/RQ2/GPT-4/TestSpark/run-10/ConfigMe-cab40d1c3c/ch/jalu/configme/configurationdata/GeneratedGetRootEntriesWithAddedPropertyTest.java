package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedGetRootEntriesWithAddedPropertyTest {

    @Test
    public void getRootEntriesWithAddedPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<Object> mockProperty = Mockito.mock(Property.class);
        Object mockValue = new Object();
        Mockito.when(mockProperty.getDefaultValue()).thenReturn(mockValue);

        builder.add(mockProperty);
        Map<String, Object> rootEntries = builder.getRootEntries();

        assertTrue("Root entries map should contain added property's default value.", rootEntries.containsValue(mockValue));
    }

}