package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddMultipleTimesTest {

    private final PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void addMultipleTimesTest() {
        List<Property<?>> properties = new ArrayList<>();
        builder.add(new Property<>("test1", "value1"));
        builder.add(new Property<>("test2", "value2"));
        builder.add(new Property<>("test3", "value3"));
        assertEquals(3, builder.getRootEntries().size());
    }

}