package ch.jalu.configme.configurationdata;

import org.junit.Test;

public class GeneratedTest {

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

// PropertyListBuilder.java
public class PropertyListBuilder {
    private List<Property> properties;

    public PropertyListBuilder() {
        properties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        properties.add(property);
    }

    public List<Property> getProperties() {
        return properties;
    }
}

// GeneratedTest.java
import org.junit.Test;

public class GeneratedTest {

}