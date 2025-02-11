package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.matchers.JUnitMatchers.hasSize;
import static org.junit.Assert.assertThat;

public class GeneratedEmptyRootEntries_test {

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
    public void emptyRootEntries_test() {
        assertThat(propertyListBuilder.getRootEntries(), hasSize(0));
    }

}