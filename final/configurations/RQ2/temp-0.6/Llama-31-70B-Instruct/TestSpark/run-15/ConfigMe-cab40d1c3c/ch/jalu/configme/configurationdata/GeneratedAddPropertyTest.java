package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.configurationdata.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;

import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        String mockPath = "path.to.property";
        when(mockProperty.getPath()).thenReturn(mockPath);
        propertyListBuilder.add(mockProperty);
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertEquals(1, rootEntries.size());
        assertTrue(rootEntries.containsKey("path"));
        Object pathValue = rootEntries.get("path");
        assertTrue(pathValue instanceof Map);
        Map<String, Object> pathMap = (Map<String, Object>) pathValue;
        assertEquals(1, pathMap.size());
        assertTrue(pathMap.containsKey("to"));
        Object toValue = pathMap.get("to");
        assertTrue(toValue instanceof Map);
        Map<String, Object> toMap = (Map<String, Object>) toValue;
        assertEquals(1, toMap.size());
        assertTrue(toMap.containsKey("property"));
        assertEquals(mockProperty, toMap.get("property"));
    }

}