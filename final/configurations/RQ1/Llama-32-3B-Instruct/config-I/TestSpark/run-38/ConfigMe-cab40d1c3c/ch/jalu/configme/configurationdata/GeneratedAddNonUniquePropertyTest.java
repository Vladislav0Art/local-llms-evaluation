package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddNonUniquePropertyTest {

    @Test
    public void addNonUniquePropertyTest() {
        Property<?> property = new Property<>("test", "value");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);
        try {
            builder.add(property);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            // Expected
        }
    }

}