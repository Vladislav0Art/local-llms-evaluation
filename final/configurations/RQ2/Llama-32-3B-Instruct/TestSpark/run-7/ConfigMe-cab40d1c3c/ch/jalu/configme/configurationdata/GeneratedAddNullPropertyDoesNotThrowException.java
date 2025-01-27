package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddNullPropertyDoesNotThrowException {

    public static class ConfigMeException extends RuntimeException {
    }

    public void setup() {
        // No setup needed
    }

    @Test
    public void addNullPropertyDoesNotThrowException() {
        assertThrows(ConfigMeException.class, () -> new PropertyListBuilder().add(null));
    }
}

public class PropertyListBuilder {

    private Map<String, Object> map = new LinkedHashMap<>();

    public void add(Property<?> property) {
        // Add logic to add a property
    }

    public List<Property<?>> create() {
        return new ArrayList<>(map.values());
    }

    public Map<String, Object> getRootEntries() {
        return map;
    }
}

public class Property {
    private String name;

    public Property(String name) {
        this.name = name;
    }

    public static Property mockProperty() {
        return new Property("MockProperty");
    }

}