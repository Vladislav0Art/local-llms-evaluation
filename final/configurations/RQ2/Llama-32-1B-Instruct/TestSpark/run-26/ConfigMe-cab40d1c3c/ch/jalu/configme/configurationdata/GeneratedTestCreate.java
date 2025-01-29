package ch.jalu.configme.configurationdata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestCreate {

    private PropertyListBuilder builder;
    private List<Property> properties;
    private Map<String, Object> rootEntries;

    @BeforeEach
    public void setup() {
        rootEntries = new LinkedHashMap<>();
        properties = new ArrayList<>();
    }

    @Test
    public void testCreate() {
        assertTrue(builder.create().isEmpty());
        builder.add(new Property("prop1", "value1"));
        assertTrue(builder.create().size() == 1);
    }

}