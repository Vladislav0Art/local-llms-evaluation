package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreatePropertiesTest {

    private PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void createPropertiesTest() {
        List<Property<?>> result = new ArrayList<>();
        builder.add(new Property<>("DataSource", "mysql"));
        builder.add(new Property<>("security", "password"));
        assertEquals(2, builder.create().size());
    }

}