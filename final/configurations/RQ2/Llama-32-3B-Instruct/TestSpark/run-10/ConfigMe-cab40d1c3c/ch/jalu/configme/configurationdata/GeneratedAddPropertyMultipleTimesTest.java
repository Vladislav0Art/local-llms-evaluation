package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddPropertyMultipleTimesTest {

    private final PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void addPropertyMultipleTimesTest() {
        builder.add(new Property<>("test1", "value"));
        builder.add(new Property<>("test2", "value2"));
        assertEquals(2, builder.getRootEntries().size());
    }

}