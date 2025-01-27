package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedCreateListFromProperty_ExpectedList {

    @Test
    public void createListFromProperty_ExpectedList() throws ConfigMeException {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property> expectedList = new ArrayList<>();
        expectedList.add(new Property("child1", "value1"));
        expectedList.add(new Property("child2", "value2"));
        Property property = new Property("property", "value");
        property.setChildren(expectedList);
        assertEquals(expectedList, builder.create(property));
    }

}

class Property {
    private String name;
    private String value;
    private List<Property> children;

    public Property(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setChildren(List<Property> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Property{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

class PropertyListBuilder {
    private Map<String, Object> rootEntries;

    public PropertyListBuilder() {
        this.rootEntries = new HashMap<>();
    }

    public void add(Property property) throws ConfigMeException {
        if (property == null) {
            throw new ConfigMeException();
        }
        rootEntries.put(property.getName(), property);
    }

    public List<Property<?>> create() {
        return new ArrayList<>(rootEntries.values());
    }

    public Map<String, Object> getRootEntries() {
        return rootEntries;
    }
}

}