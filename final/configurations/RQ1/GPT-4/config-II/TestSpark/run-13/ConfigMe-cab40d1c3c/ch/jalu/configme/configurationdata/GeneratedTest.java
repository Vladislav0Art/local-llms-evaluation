package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void addPropertyAlreadyExistsTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new TestProperty("test.path");

        builder.add(property);
        builder.add(property);
    }

    @Test
    public void addPropertyUnexpectedEntryTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new TestProperty("test"));

        // trigger unexpected entry exception
        builder.add(new TestProperty("test.path"));
    }

    @Test
    public void addPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new TestProperty("test.path");

        builder.add(property);

        // assertions to check if property was added
        assertNotNull(builder.getRootEntries().get("test"));
        assertTrue(builder.getRootEntries().get("test") instanceof Map<?, ?>);
    }

    @Test
    public void createDoesNotModifyStateTest() {
        PropertyListBuilder builder = new PropertyListBuilder();

        // adding a few properties
        builder.add(new TestProperty("database.url"));
        builder.add(new TestProperty("database.username"));
        builder.add(new TestProperty("database.password"));

        // number of root entries before create
        int rootEntriesBefore = builder.getRootEntries().size();

        builder.create();

        // number of root entries after create
        int rootEntriesAfter = builder.getRootEntries().size();

        assertEquals(rootEntriesBefore, rootEntriesAfter);
    }

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