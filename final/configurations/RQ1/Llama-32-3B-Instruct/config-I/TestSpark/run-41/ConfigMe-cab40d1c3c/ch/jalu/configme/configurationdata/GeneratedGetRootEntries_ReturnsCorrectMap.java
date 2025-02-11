package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntries_ReturnsCorrectMap {

    @Test
    public void getRootEntries_ReturnsCorrectMap() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> prop1 = new Property<>("prop1", "value1");
        Property<?> prop2 = new Property<>("prop2", "value2");
        builder.add(prop1);
        builder.add(prop2);
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertTrue(rootEntries.size() > 0);
    }

}