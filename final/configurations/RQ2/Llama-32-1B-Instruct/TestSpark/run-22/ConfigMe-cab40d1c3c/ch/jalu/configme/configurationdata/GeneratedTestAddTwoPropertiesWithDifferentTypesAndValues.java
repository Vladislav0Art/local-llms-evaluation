package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAddTwoPropertiesWithDifferentTypesAndValues {

    @Test
    public void testAddTwoPropertiesWithDifferentTypesAndValues() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> map = builder.create();
        assertTrue(map.containsKey("property1"));
        assertTrue(map.containsKey("property2"));
    }

}