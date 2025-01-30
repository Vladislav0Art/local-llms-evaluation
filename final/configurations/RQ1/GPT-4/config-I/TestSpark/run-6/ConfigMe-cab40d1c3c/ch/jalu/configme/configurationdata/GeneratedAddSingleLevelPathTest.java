package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddSingleLevelPathTest {

    @Test
    public void addSingleLevelPathTest() {
        // Given
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<String> property = new StringProperty("Path", "DefaultValue");

        // When
        listBuilder.add(property);

        // Then
        assertTrue(listBuilder.getRootEntries().containsKey("Path"));
        assertEquals(property, listBuilder.getRootEntries().get("Path"));
    }

}