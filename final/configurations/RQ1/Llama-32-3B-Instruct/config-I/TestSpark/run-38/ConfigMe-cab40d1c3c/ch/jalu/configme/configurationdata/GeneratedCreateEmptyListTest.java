package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateEmptyListTest {

    @Test
    public void createEmptyListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> result = builder.create();
        assertTrue(result.isEmpty());
    }

    private static class Property {
        private final String path;
        private final Object value;

        private Property(String path, Object value) {
            this.path = path;
            this.value = value;
        }
    }

}