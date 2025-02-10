package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class GeneratedAddPropertyMultipleElementListTest {

    @Test
    public void addPropertyMultipleElementListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        builder.add(new Property<>());
        builder.add(new Property<>());
        assertEquals(2, properties.size());
        assertTrue(properties.get(0).equals(builder.getRootEntries().get("0")));
        assertTrue(properties.get(1).equals(builder.getRootEntries().get("1")));
    }

}