package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestConfigCreation {

    @Test
    public void testConfigCreation() {
        Config config = new Config();
        List<Property<?>> result1 = config.create();
        assertTrue(result1.size() > 0);

        Map<String, Object> expected1 = new HashMap<>();
        expected1.put("test", "value");
        assertEquals(1, ((Map<String, Object>) result1.get("test")).size());
    }

}