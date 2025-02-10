package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;

public class GeneratedTestRootEntries {

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
    public void testRootEntries() {
        PropertyListBuilderImpl builder = new PropertyListBuilderImpl();
        java.util.Map<String, Object> map = builder.create(); // get the map directly
        assertThat(map, is(null)); // test properties are not present in the output
    }

}