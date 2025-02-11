package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.matchers.JUnitMatchers.hasSize;
import static org.junit.Assert.assertThat;

public class GeneratedAddPropertiesWithPath_test {

    private List<Property<?>> properties;

    public void add(Property<?> property) {
        properties.add(property);
    }

    public List<Property<?>> create() {
        return properties;
    }
}

public class Property {
    private String value;

    public Property(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Property{" +
                "value='" + value + '\'' +
                '}';
    }
}

import org.junit.Test;
import static org.junit.matchers.JUnitMatchers.hasSize;
import static org.junit.Assert.assertThat;

public class PropertyListBuilderTest {

    private PropertyListBuilder propertyListBuilder;

    public void init() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addPropertiesWithPath_test() {
        List<Property<?>> properties = new ArrayList<>();
        properties.add(new Property<>("a.b"));
        properties.add(new Property<>("c.d"));

        propertyListBuilder.add(properties.get(0));
        propertyListBuilder.add(properties.get(1));

        assertThat(propertyListBuilder.create(), hasSize(2));
    }

}