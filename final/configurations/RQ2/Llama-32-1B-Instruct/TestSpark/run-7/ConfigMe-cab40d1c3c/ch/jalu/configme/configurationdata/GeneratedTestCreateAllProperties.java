package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestCreateAllProperties {

    @Test
    public void testCreateAllProperties() {
        PropertyListBuilder builder = new PropertyListBuilder();
        String propertyName1 = "property1";
        String propertyName2 = "property2";

        when(propertyExists(propertyName1)).thenReturn(true);
        when(propertyExists(propertyName2)).thenReturn(false);

        List<Property<?>> properties = builder.create();
        assertNotNull(properties);
        assertEquals(2, properties.size());
        assertTrue(properties.contains(any(Property.class)));
    }

}