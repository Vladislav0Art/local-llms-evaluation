package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;

public class GeneratedTestAddProperties {

    public static class Property {
        public String key;
        public Object value;

        public Property(String key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public interface PropertyListBuilder {
        Map<String, Object> create();
    }

    public class PropertyListBuilderImpl implements PropertyListBuilder {
        private Map<String, Object> entries = new java.util.LinkedHashMap<>();

        @Override
        public Map<String, Object> create() {
            return entries;
        }

        public void add(Property property) {
            entries.put(property.key, property.value);
        }
    }

    @Test
    public void testAddProperties() {
        PropertyListBuilderImpl builder = new PropertyListBuilderImpl();
        Property property1 = new Property("key1", "value1");
        Property property2 = new Property("key2", "value2");

        builder.add(property1);
        builder.add(property2);

        java.util.Map<String, Object> map = (java.util.Map<String, Object>) builder.create(); // get the map directly
        assertThat((String) map.get("key1"), is("value1"));
        assertThat((String) map.get("key2"), is("value2"));
    }

}