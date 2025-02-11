package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCreateListTest {

    @Test
    public void createListTest() {
        Property<?> property1 = new Property<>("test", "value");
        Property<?> property2 = new Property<>("security", "config");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property1);
        builder.add(property2);
        List<Property<?>> result = builder.create();
        assertEquals(2, result.size());
    }

}