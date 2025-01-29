package ch.jalu.configme.configurationdata;

import org.jetbrains.annotations.NotNull;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAddMultipleProperties_ReturnsCorrectProperties {

    public PropertyList build() {
        return new PropertyList();
    }

    @Test
    public void testAddMultipleProperties_ReturnsCorrectProperties() {
        // Arrange
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        String key1 = "key1";
        String value1 = "value1";

        String key2 = "key2";
        String value2 = "value2";

        // Act
        List<Property<?>> properties = PropertyListBuilder.testAddProperty().build();

        // Assert
        assertEquals(2, properties.size());
    }

}