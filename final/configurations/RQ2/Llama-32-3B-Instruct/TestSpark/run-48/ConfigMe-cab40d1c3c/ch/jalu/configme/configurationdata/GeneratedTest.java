package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    public static class Property {
        public String key;
        public Object value;

        public Property(String key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public interface IPropertyListBuilder {
        java.util.Map<String, Object> getMap();
    }

    public class PropertyListBuilderImpl implements IPropertyListBuilder {
        private java.util.Map<String, Object> entries = new java.util.LinkedHashMap<>();

        @Override
        public java.util.Map<String, Object> getMap() {
            return entries;
        }
    }

}