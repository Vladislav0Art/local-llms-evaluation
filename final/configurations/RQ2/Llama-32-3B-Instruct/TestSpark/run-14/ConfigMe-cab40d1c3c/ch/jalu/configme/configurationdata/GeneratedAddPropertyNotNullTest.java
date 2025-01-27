package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddPropertyNotNullTest {

    @Test
    public void addPropertyNotNullTest() {
        List<Property<?>> properties = new ArrayList<>();
        Property<?> property1 = new Property<>("key1", "value1");
        Property<?> property2 = new Property<>("key2", "value2");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property1);
        builder.add(property2);
        List<Property<?>> result = builder.create();
        assertEquals(2, result.size());
    }

}