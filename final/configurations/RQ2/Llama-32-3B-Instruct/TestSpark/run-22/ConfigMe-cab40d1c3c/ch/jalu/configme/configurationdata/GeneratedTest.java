package ch.jalu.configme.configurationdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    private String name;
    private String value;

    public Property(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public class PropertyListBuilder {

    private List<Property> properties;

    public PropertyListBuilder() {
        this.properties = new ArrayList<>();
    }

    public void add(Property property) {
        if (property == null) {
            throw new ConfigMeException("Null property is not allowed");
        }
        properties.add(property);
    }

    public List<Property> create(List<Property> properties) {
        return properties;
    }

    public Map<String, Object> getRootEntries() {
        // implementation...
        return null; // placeholder
    }
}

public class ConfigMeException extends Exception {
}

public class PropertyListBuilderTest {

    @Test
    public void getRootEntries_ReturnsEmptyMap() {
        Map<String, Object> entries = new PropertyListBuilder().getRootEntries();
        assertTrue(entries.isEmpty());
    }

}