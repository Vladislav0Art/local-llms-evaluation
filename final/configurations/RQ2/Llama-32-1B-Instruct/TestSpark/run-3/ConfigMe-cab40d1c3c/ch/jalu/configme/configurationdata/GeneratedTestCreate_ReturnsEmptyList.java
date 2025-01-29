package ch.jalu.configme.configurationdata;

import org.jetbrains.annotations.NotNull;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestCreate_ReturnsEmptyList {

    public PropertyListBuilder testAddProperty() {
        return new PropertyListBuilder();
    }

    @Test
    public void testCreate_ReturnsEmptyList() {
        // Arrange
        Map<String, Object> rootEntries = new LinkedHashMap<>();

        // Act
        List<Property<?>> properties = PropertyListBuilder.testAddProperty().create();

        // Assert
        assertNull(properties);
    }

}