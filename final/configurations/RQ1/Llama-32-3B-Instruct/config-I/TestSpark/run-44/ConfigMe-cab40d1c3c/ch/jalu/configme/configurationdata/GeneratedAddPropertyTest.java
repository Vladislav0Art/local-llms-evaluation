package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddPropertyTest {

    private PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void addPropertyTest() {
        builder.add(new Property<>("DataSource", "mysql"));
        assertEquals(1, builder.getRootEntries().size());
    }

}