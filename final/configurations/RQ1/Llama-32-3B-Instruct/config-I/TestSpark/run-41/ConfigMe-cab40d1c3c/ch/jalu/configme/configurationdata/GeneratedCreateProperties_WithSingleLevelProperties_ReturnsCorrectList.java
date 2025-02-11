package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedCreateProperties_WithSingleLevelProperties_ReturnsCorrectList {

    @Test
    public void createProperties_WithSingleLevelProperties_ReturnsCorrectList() {
        Property<?> prop1 = new Property<>("prop1", "value1");
        Property<?> prop2 = new Property<>("prop2", "value2");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(prop1);
        builder.add(prop2);
        List<Property<?>> result = builder.create();
        assertEquals(2, result.size());
    }

}