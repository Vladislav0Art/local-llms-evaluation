package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.jupiter.api.BeforeEach;

public class GeneratedTestAddProperty {

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

}