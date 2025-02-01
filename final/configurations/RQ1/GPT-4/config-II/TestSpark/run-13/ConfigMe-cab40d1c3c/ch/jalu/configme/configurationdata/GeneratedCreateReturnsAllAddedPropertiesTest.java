package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCreateReturnsAllAddedPropertiesTest {

    @Test
    public void createReturnsAllAddedPropertiesTest() {
        PropertyListBuilder builder = new PropertyListBuilder();

        // adding a few properties
        Property<?> property1 = new TestProperty("database.url");
        Property<?> property2 = new TestProperty("database.username");
        Property<?> property3 = new TestProperty("database.password");
        builder.add(property1);
        builder.add(property2);
        builder.add(property3);

        // create and check if all properties are added
        assertEquals(3, builder.create().size());
    }

    private static class TestProperty implements Property<Object> {
        private String path;

        TestProperty(String path) {
            this.path = path;
        }

        @Override
        public Object getValue() {
            return null;
        }

        @Override
        public void setValue(Object value) {
        }

        @Override
        public String getPath() {
            return this.path;
        }

        @Override
        public Object getDefaultValue() {
            return null;
        }
    }

}