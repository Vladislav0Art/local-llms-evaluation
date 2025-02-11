package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedAddProperty_WithNestedMap_ReturnsCorrectList {

    @Test
    public void addProperty_WithNestedMap_ReturnsCorrectList() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> map = new LinkedHashMap<>();
        builder.add(new Property<>("a", 1));
        builder.add(new Property<>("b", 2));
        map.put("c", 3);
        List<Property<?>> result = builder.create();
        assertEquals(0, result.size());
    }

}