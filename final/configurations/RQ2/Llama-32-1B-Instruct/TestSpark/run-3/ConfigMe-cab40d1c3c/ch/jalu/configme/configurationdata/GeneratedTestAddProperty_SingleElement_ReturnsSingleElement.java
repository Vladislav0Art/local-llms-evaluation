package ch.jalu.configme.configurationdata;

import org.jetbrains.annotations.NotNull;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAddProperty_SingleElement_ReturnsSingleElement {

    public PropertyList build() {
        return new PropertyList();
    }

    @Test
    public void testAddProperty_SingleElement_ReturnsSingleElement() {
        // Arrange
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        String key = "key";
        String value = "value";

        // Act
        List<Property<?>> properties = PropertyListBuilder.testAddProperty().build();

        // Assert
        assertNotNull(properties);
        assertTrue(properties.size() == 1);
        assertEquals(1, properties.get(0).getValue());
    }

}