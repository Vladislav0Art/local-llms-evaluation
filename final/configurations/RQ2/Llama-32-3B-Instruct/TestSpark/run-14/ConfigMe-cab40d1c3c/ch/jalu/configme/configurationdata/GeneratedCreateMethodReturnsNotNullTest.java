package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateMethodReturnsNotNullTest {

    @Test
    public void createMethodReturnsNotNullTest() {
        List<Property<?>> properties = new ArrayList<>();
        Property<?> property1 = new Property<>("key1", "value1");
        Property<?> property2 = new Property<>("key2", "value2");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property1);
        builder.add(property2);
        List<Property<?>> result = builder.create();
        assertNotNull(result);
    }

}