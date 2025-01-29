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

public class GeneratedTestAddProperty {

    @Test
    public void testAddProperty() {
        PropertyListBuilder builder = new PropertyListBuilder();
        String propertyName = "testProperty";
        when(propertyExists(propertyName)).thenReturn(false);
        builder.add(any(Property.class));
        verify(rootEntries()).put(propertyName, null);
    }

}