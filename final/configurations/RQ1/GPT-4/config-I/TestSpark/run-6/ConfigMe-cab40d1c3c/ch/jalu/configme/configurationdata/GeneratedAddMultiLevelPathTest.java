package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddMultiLevelPathTest {

    @Test
    public void addMultiLevelPathTest() {
        // Given
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<String> property = new StringProperty("First.Second", "DefaultValue");

        // When
        listBuilder.add(property);

        // Then
        assertTrue(listBuilder.getRootEntries().containsKey("First"));
        Map<String, Object> secondLevelMap = (Map<String, Object>) listBuilder.getRootEntries().get("First");
        assertTrue(secondLevelMap.containsKey("Second"));
        assertEquals(property, secondLevelMap.get("Second"));
    }

}