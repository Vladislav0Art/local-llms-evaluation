package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConfigNestedProperties {

    @Test
    public void testConfigNestedProperties() {
        Config config = new Config();
        Property<String> property1 = new Property<>("test", "value");
        Property<Map<String, String>> nestedProperty1 = new Property<>("nested", "{\"a\": \"b\"}");
        List<Property<?>> result3 = config.add(property1);
        ((List<Property>) result3.get("test")).add(nestedProperty1);

        Map<String, Object> expected3 = new HashMap<>();
        expected3.put("test", new HashMap<>());
        Map<String, String> expectedNested = new HashMap<>();
        expectedNested.put("a", "b");
        ((Map<String, Object>) expected3.get("test")).put("nested", expectedNested);

        assertEquals(1, result3.size());
        assertEquals(1, ((List<Property>) result3.get("test")).size());
    }

}

class Property<T> {
    private String key;
    private T value;

    public Property(String key, T value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Property<?> other = (Property<?>) obj;
        return key.equals(other.key);
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }
}

class Config {
    private List<Property<?>> properties;

    public Config() {
        this.properties = new ArrayList<>();
    }

    public List<Property<?>> create() {
        List<Property<?>> result = new ArrayList<>();
        for (Property<?> property : properties) {
            result.add(property);
        }
        return result;
    }

    public void add(Property<?> property) {
        properties.add(property);
    }

}