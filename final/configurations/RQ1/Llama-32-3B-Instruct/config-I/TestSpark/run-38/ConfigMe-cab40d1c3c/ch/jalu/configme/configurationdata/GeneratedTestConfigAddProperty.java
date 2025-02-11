package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConfigAddProperty {

    @Test
    public void testConfigAddProperty() {
        Config config = new Config();
        Property<String> property1 = new Property<>("test", "value");
        List<Property<?>> result2 = config.add(property1);
        assertTrue(result2.size() > 0);

        Map<String, Object> expected2 = new HashMap<>();
        expected2.put("test", "value");
        assertEquals(1, ((Map<String, Object>) result2.get("test")).size());
    }

}