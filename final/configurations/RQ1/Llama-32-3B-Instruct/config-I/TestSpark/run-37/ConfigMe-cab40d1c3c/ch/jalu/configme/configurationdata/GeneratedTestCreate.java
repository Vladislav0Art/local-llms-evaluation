package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.put;
import static org.mockito.Mockito.verify;

public class GeneratedTestCreate {

    @Mock
    private RootEntries rootEntries;

    @Test
    public void testCreate() {
        // Arrange
        List<Property<?>> expectedProperties = new ArrayList<>();
        expectedProperties.add(new Property("key", "value"));
        expectedProperties.add(new Property("key2", "value2"));

        // Act
        List<Property<?>> result = propertyListBuilder.create();

        // Assert
        assertEquals(expectedProperties, result);
    }
}

class Property {
    private String key;
    private String value;

    public Property(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return Objects.equals(key, property.key);
    }
}

class RootEntries {
}

class PropertyListBuilder {
    private final RootEntries rootEntries;

    public PropertyListBuilder(RootEntries rootEntries) {
        this.rootEntries = rootEntries;
    }

    public List<Property<?>> create() {
        // implementation to build the list of properties
        return new ArrayList<>();
    }

}