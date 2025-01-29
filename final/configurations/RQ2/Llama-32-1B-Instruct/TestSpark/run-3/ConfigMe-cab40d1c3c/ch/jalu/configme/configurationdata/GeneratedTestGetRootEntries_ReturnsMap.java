package ch.jalu.configme.configurationdata;

import org.jetbrains.annotations.NotNull;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestGetRootEntries_ReturnsMap {

    public PropertyListBuilder testAddProperty() {
        return new PropertyListBuilder();
    }

    @Test
    public void testGetRootEntries_ReturnsMap() {
        // Arrange
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        String key1 = "key1";
        String value1 = "value1";

        String key2 = "key2";
        String value2 = "value2";

        rootEntries.put(key1, value1);
        rootEntries.put(key2, value2);

        // Act
        Map<String, Object> properties = PropertyListBuilder.testAddProperty().getRootEntries();

        // Assert
        assertNotNull(properties);
    }

}