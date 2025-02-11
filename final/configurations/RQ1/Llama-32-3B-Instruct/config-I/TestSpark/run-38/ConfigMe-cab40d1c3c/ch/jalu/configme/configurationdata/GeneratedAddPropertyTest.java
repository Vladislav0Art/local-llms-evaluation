package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        Property<?> property = new Property<>("test", "value");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property);
    }

}