package ch.jalu.configme.configurationdata;

import org.jetbrains.annotations.NotNull;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetRootEntries_ReturnsCorrectValues {

    public PropertyList build() {
        return new PropertyList();
    }

    @Test
    public void testGetRootEntries_ReturnsCorrectValues() {
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

    public static class Property {
        private Object value;

        public Property(Object value) {
            this.value = value;
        }

        @NotNull
        public Object getValue() {
            return value;
        }
    }

    public static class PropertyList {
        private List<Property> properties = new ArrayList<>();

        public void addProperty(Property property) {
            properties.add(property);
        }

        public List<Property> getRootEntries() {
            return properties;
        }
    }

}