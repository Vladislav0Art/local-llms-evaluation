package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.jupiter.api.BeforeEach;

public class GeneratedTestAddEmptyList {

    @BeforeEach
    public void init() {
        properties = new ArrayList<>();
        rootEntries = new HashMap<>();
    }

    @Test
    public void testAddEmptyList() {
        boolean result = builder.addProperty(null, null);
        assertFalse(result);
    }

}