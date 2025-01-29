package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.jupiter.api.BeforeEach;

public class GeneratedTestAddEmptyMap {

    @BeforeEach
    public void init() {
        properties = new ArrayList<>();
        rootEntries = new HashMap<>();
    }

    @Test
    public void testAddEmptyMap() {
        properties.add(new Property("prop1", "value1"));
        // No need to add anything to the map as it's empty.
    }

}