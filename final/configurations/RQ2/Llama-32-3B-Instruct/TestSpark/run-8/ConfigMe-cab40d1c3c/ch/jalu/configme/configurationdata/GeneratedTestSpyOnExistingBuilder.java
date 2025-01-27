package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSpyOnExistingBuilder {

    @Test
    public void testSpyOnExistingBuilder() {
        PropertyListBuilder existingBuilder = new PropertyListBuilder();

        PropertyListBuilder spyBuilder = Mockito.spy(existingBuilder);

        Mockito.when(spyBuilder.addProperty("property1", "value1")).thenReturn(spyBuilder);
        Mockito.when(spyBuilder.addProperty("property2", "value2")).thenReturn(spyBuilder);

        List<Property<?>> expectedProperties = new ArrayList<>();
        expectedProperties.add(new Property<>("property1", "value1"));
        expectedProperties.add(new Property<>("property2", "value2"));

        List<Property<?>> actualProperties = new ArrayList<>(spyBuilder.create());

        assertThat(actualProperties, is(expectedProperties));

    }

}

class Property {
    private String key;
    private String value;

    public Property(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return key.equals(property.key) && value.equals(property.value);
    }

    public String getKey() {
        return key;
    }
}

class PropertyListBuilder {

    private List<Property> properties;

    public PropertyListBuilder() {
        this.properties = new ArrayList<>();
    }

    public void addProperty(String key, String value) {
        properties.add(new Property(key, value));
    }

    public List<Property> create() {
        return properties;
    }

}