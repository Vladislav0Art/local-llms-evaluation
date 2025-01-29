package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.jupiter.api.BeforeEach;

public class GeneratedTest {

    @BeforeEach
    public void init() {
        properties = new ArrayList<>();
        rootEntries = new HashMap<>();
    }

    @Test
    public void testAddProperty() {
        properties.add(new Property("prop1", "value1"));
        assertTrue(properties.containsAll(Arrays.asList(new Property("prop1", "value1"), new Property("prop2", "value2"))));
    }

    @Test
    public void testAddMap() {
        rootEntries.put("key", "value");
        properties.add(new Property("prop1", "value1"));
        assertTrue(rootEntries.get("key").equals("value"));
    }

    @Test
    public void testAddEmptyList() {
        boolean result = builder.addProperty(null, null);
        assertFalse(result);
    }

    @Test
    public void testAddEmptyMap() {
        properties.add(new Property("prop1", "value1"));
        // No need to add anything to the map as it's empty.
    }

}