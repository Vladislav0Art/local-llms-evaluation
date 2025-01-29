package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestGetRootEntriesReturnRootEntriesMap {

    private PropertyListBuilder propertyListBuilder;

    @BeforeEach
    public void init() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testGetRootEntriesReturnRootEntriesMap() {
        // Arrange
        Map<String, Object> expectedRootEntries = new LinkedHashMap<>();
        expectedRootEntries.put("property1", "value1");
        expectedRootEntries.put("property2", "value2");

        // Act and Assert
        Map<String, Object> result = propertyListBuilder.getRootEntries();
        assertEquals(expectedRootEntries, result);
    }

}