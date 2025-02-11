package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddDuplicatePropertyTest {

    @Test
    public void addDuplicatePropertyTest() {
        Property<?> property = new Property<>("test", "value");
        PropertyListBuilder builder = new PropertyListBuilder();
        @SuppressWarnings("unchecked")
        Map<String, Object> result = (Map<String, Object>) builder.getRootEntries();
        assertTrue(result.containsKey("test"));
        try {
            builder.add(property);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            // Expected
        }
    }

}