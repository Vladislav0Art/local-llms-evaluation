package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCreate {

    private String key;
    private Object value;

    public Property(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}

public class PropertyListBuilder {
    private List<Property> properties = new ArrayList<>();

    public void add(Property property) {
        properties.add(property);
    }

    public List<Property> create() {
        return properties;
    }

    public Map<String, Object> getRootEntries() {
        Map<String, Object> map = new HashMap<>();
        for (Property property : properties) {
            map.put(property.getKey(), property.getValue());
        }
        return map;
    }
}

public class ConfigMeException extends Exception {
}

import org.junit.Test;
import static org.junit.Assert .*;

public class GeneratedTest {

    @Test
    public void testCreate() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property> properties = builder.create();
        assertTrue(properties.size() > 0);
    }

}