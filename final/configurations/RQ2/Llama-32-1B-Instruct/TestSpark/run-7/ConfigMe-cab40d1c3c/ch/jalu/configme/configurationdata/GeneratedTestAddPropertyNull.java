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

public class GeneratedTestAddPropertyNull {

    @Test
    public void testAddPropertyNull() {
        PropertyListBuilder builder = new PropertyListBuilder();

        when(propertyExists(any(Property.class))).thenReturn(false);

        String propertyName = "testProperty";
        when(builder.add(any(Property.class))).thenAnswer(r -> {
            return null;
        });

        assertEquals(propertyName, null);
    }

}