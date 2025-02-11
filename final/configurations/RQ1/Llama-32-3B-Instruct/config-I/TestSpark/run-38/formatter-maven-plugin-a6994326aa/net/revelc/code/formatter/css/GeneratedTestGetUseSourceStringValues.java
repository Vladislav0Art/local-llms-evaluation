package net.revelc.code.formatter.css;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestGetUseSourceStringValues {

    public static class Map {
        public interface Key {
        }

        @FunctionalInterface
        public interface Consumer<K> {
            void accept(K k);
        }

        public static <K, V> boolean of(K k, Consumer<V> consumer) {
            consumer.accept(k);
            return true;
        }
    }

    public static class ConfigurationSource {
        private String value;

        public ConfigurationSource(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "ConfigurationSource{" +
                    "value='" + value + '\'' +
                    '}';
        }

        public boolean isRgbAsHex() {
            return value.equals("true");
        }
    }

    public static class CssFormatter {
        private ConfigurationSource cfg;

        public void init(Map<String, String> options, ConfigurationSource cfg) {
            this.cfg = cfg;
        }

        public Map<String, String> getProperties() {
            return new java.util.HashMap<>();
        }

        public boolean getRgbAsHex() {
            return cfg.isRgbAsHex();
        }
    }

    @Test
    public void testGetUseSourceStringValues() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.getProperties().get("useSourceStringValues"));
    }
}

public class GeneratedTest {

    public static class Map {
        public interface Key {
        }

        @FunctionalInterface
        public interface Consumer<K> {
            void accept(K k);
        }

        public static <K, V> boolean of(K k, Consumer<V> consumer) {
            consumer.accept(k);
            return true;
        }
    }

    public static class ConfigurationSource {
        private String value;

        public ConfigurationSource(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "ConfigurationSource{" +
                    "value='" + value + '\'' +
                    '}';
        }

        public boolean isRgbAsHex() {
            return value.equals("true");
        }
    }

    public static class CssFormatter {
        private ConfigurationSource cfg;

        public void init(Map<String, String> options, ConfigurationSource cfg) {
            this.cfg = cfg;
        }

        public Map<String, String> getProperties() {
            return new java.util.HashMap<>();
        }

        public boolean getRgbAsHex() {
            return cfg.isRgbAsHex();
        }
    }

}