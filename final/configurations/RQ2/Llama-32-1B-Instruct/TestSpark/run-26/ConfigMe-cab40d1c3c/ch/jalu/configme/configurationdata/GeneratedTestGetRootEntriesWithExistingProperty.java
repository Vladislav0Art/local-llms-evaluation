package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetRootEntriesWithExistingProperty {

    private PropertyListBuilder builder;
    private List<Property> properties;
    private Map<String, Object> rootEntries;

    @BeforeEach
    public void setup() {
        rootEntries = new LinkedHashMap<>();
        properties = new ArrayList<>();
    }

    @Test
    public void testGetRootEntriesWithExistingProperty() {
        assertEquals(null, rootEntries);
        builder.add(new Property("existingProp", "existingValue"));
        assertEquals(rootEntries, builder.getRootEntries());
    }

}