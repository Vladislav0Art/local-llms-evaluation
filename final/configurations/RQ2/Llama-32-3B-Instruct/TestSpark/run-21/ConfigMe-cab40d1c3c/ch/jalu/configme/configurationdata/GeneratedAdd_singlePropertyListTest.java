package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedAdd_singlePropertyListTest {

    @Test
    public void add_singlePropertyListTest() {
        List<Property<?>> properties = Collections.singletonList(new Property<>("test"));
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(properties.get(0));
        List<Property<?>> result = builder.create();
        assertEquals(1, result.size());
    }

}