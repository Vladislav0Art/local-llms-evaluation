package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedAddProperty WithOneProperty_ReturnsWithSingleProperty {

    @Test
    public void addProperty

    WithOneProperty_ReturnsWithSingleProperty() {
        List<Property<?>> expected = new ArrayList<>();
        expected.add(new Property<>("test", "value"));
        List<Property<?>> result = new PropertyListBuilder()
                .add(new Property<>("test", "value"))
                .create();
        assertEquals(1, result.size());
        assertEquals("test", result.get(0).getName());
    }

}