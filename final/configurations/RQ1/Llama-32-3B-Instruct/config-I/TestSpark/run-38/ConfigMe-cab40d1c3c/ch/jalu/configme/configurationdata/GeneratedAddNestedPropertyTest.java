package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddNestedPropertyTest {

    @Test
    public void addNestedPropertyTest() {
        Property<?> property = new Property<>("test", "value");
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> result = builder.add(property);
        assertTrue(result.containsKey("test"));
        assertTrue(((Map<String, Object>) result.get("test")).containsKey("nested"));
    }

}