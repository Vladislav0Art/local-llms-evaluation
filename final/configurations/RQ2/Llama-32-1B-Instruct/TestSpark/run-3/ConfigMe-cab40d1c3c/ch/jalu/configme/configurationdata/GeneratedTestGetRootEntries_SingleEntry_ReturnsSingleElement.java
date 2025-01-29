package ch.jalu.configme.configurationdata;

import org.jetbrains.annotations.NotNull;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestGetRootEntries_SingleEntry_ReturnsSingleElement {

    public PropertyListBuilder testAddProperty() {
        return new PropertyListBuilder();
    }

    @Test
    public void testGetRootEntries_SingleEntry_ReturnsSingleElement() {
        // Arrange
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        String key = "key";
        String value = "value";

        rootEntries.put(key, value);

        // Act
        Map<String, Object> properties = PropertyListBuilder.testAddProperty().getRootEntries();

        // Assert
        assertNotNull(properties);
    }

}