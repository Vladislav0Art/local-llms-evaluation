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

public class GeneratedTestCreateAllPropertiesNotFound {

    @Test
    public void testCreateAllPropertiesNotFound() {
        PropertyListBuilder builder = new PropertyListBuilder();

        when(propertyExists(any(Property.class))).thenReturn(false);

        String propertyName1 = "property1";
        String propertyName2 = "property2";

        List<Property<?>> properties = builder.create();
        assertNotNull(properties);
        assertEquals(0, properties.size());
    }

    private Object propertyNotFoundException(String propertyName) {
        return new ConfigMeException(ConfigMeException.PropertyNotExistsException.class.getName(), propertyName);
    }

}