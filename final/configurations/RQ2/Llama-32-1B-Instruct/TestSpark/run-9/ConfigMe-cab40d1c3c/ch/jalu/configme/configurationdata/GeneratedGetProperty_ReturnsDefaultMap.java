package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedGetProperty_ReturnsDefaultMap {

    public void addProperty(Property<?> property) {
        if (property == null || property.isEmpty()) {
            throw new ConfigMeException("Cannot create property with empty name");
        }
        getRootEntries().putAll(property.getNames());
    }

    public @NotNull List<Property<?>> create() {
        return new ArrayList<>();
    }

    protected final Map<String, Object> getRootEntries() {
        return new HashMap<>();
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions .*;

public class PropertyListBuilderTest {

    private Property emptyProperty = new Property();

    @Test
    public void getProperty_ReturnsDefaultMap() {
        // Act
        Map<String, Object> map = PropertyListBuilder.getProperty();

        // Assert
        assertNotNull(map);
        assertTrue(map instanceof HashMap);
        assertEquals(0, ((HashMap) map).size());
    }

}