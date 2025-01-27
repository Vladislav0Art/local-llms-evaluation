package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateNonEmptyListTest {

    private final PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void createNonEmptyListTest() {
        List<Property<?>> properties = new ArrayList<>();
        properties.add(new Property<>("test1", "value1"));
        properties.add(new Property<>("test2", "value2"));
        List<Property<?>> expected = properties;
        List<Property<?>> actual = builder.create();
        assertTrue(actual.containsAll(expected));
        assertSame(expected, actual);
    }

}