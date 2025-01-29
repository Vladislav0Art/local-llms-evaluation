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

public class GeneratedTestGetRootEntries {

    @Test
    public void testGetRootEntries() {
        PropertyListBuilder builder = new PropertyListBuilder();
        String propertyName1 = "property1";
        String propertyName2 = "property2";

        when(propertyExists(propertyName1)).thenReturn(true);
        when(propertyExists(propertyName2)).thenReturn(false);

        Map<String, Object> rootEntries = builder.getRootEntries();
        assertNotNull(rootEntries);
        assertEquals(2, rootEntries.size());
        assertTrue(rootEntries.containsKey(propertyName1));
        assertFalse(rootEntries.containsKey(propertyName2));
    }

}