package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.jupiter.api.BeforeEach;

public class GeneratedTestAddMap {

    @BeforeEach
    public void init() {
        properties = new ArrayList<>();
        rootEntries = new HashMap<>();
    }

    @Test
    public void testAddMap() {
        rootEntries.put("key", "value");
        properties.add(new Property("prop1", "value1"));
        assertTrue(rootEntries.get("key").equals("value"));
    }

}