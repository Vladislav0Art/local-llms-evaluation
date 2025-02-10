package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class GeneratedAddPropertySingleElementListTest {

    @Test
    public void addPropertySingleElementListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        builder.add(new Property<>());
        assertEquals(1, properties.size());
        assertSame(builder.getRootEntries().get("0"), properties.get(0));
    }

}