package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedCreateProperties_WithMultiLevelProperties_ReturnsCorrectList {

    @Test
    public void createProperties_WithMultiLevelProperties_ReturnsCorrectList() {
        Property<?> prop1 = new Property<>("DataSource", "mysql");
        Property<?> prop2 = new Property<>("security", "password");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(prop1);
        builder.add(prop2);
        List<Property<?>> result = builder.create();
        assertEquals(0, result.size());
    }

}