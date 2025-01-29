package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedGetRootEntries_ReturnsDefaultMap {

    public void addProperty(Property<?> property) {
        add(property);
    }

    public List<Property<?>> getProperty() throws ConfigMeException {
        return create();
    }

    protected final Map<String, Object> getRootEntries() {
        return new LinkedHashMap<>();
    }
}

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions .*;

public class PropertyListBuilderTest {

    @Mock
    private Property property;

    @Test
    public void getRootEntries_ReturnsDefaultMap() {
        // Act
        Map<String, Object> map = PropertyListBuilder.getRootEntries();

        // Assert
        assertNotNull(map);
        assertTrue(map instanceof LinkedHashMap);
        assertEquals(0, ((LinkedHashMap) map).size());
    }

}