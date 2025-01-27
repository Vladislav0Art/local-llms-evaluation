package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestAddMultipleProperties {

    @Test
    public void testAddMultipleProperties() {
        List<Property> propertyList = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder(propertyList);
        builder.addProperty("property1", "value1");
        builder.addProperty("property2", "value2");
        assertEquals(2, ((PropertyList) builder.getProperties()).size());
    }
}

class Property {
    private String name;
    private String value;

    public Property(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return name.equals(property.name);
    }
}

class PropertyList implements List<Property> {

    private ArrayList<Property> list;

    public PropertyList() {
        this.list = new ArrayList<>();
    }

    @Override
    public boolean add(Property element) {
        if (element == null) {
            throw new NullPointerException("You can not add Null into the list");
        }
        return list.add(element);
    }

    @Override
    public int size() {
        return list.size();
    }
}

class PropertyListBuilder {

    private List<Property> propertyList;

    public PropertyListBuilder(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    public void addProperty(String name, String value) {
        propertyList.add(new Property(name, value));
    }

    public List<Property> getProperties() {
        return propertyList;
    }

}