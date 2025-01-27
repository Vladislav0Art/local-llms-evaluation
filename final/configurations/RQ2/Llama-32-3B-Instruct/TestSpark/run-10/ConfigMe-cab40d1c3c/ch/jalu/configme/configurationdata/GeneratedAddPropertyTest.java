package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddPropertyTest {

    private final PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void addPropertyTest() {
        List<Property<?>> properties = new ArrayList<>();
        builder.add(new Property<>("test", "value"));
        assertEquals(1, builder.getRootEntries().size());
    }

}