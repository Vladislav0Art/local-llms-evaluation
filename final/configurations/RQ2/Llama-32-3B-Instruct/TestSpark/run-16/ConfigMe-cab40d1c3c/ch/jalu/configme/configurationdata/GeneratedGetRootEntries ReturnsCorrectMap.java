package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntries ReturnsCorrectMap {

    @Test
    public void getRootEntries

    ReturnsCorrectMap() {
        // given:
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> expectedRootEntries = new LinkedHashMap<>();
        expectedRootEntries.put("a", "b");

        // when:
        Map<String, Object> rootEntries = builder.getRootEntries();

        // then:
        assertEquals(expectedRootEntries, rootEntries);
    }
}

public class PropertyListBuilder {
    private List<Property<?>> properties = new ArrayList<>();

    public void add(Property<?> property) {
        if (property == null) {
            throw new ConfigMeException("Property cannot be null");
        }
        this.properties.add(property);
    }

    public List<Property<?>> create() {
        return properties;
    }

    protected final Map<String, Object> getRootEntries() {
        return new LinkedHashMap<>();
    }

}