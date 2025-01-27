package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesReturnsNotEmptyTest {

    @Test
    public void getRootEntriesReturnsNotEmptyTest() {
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new Property<>("key1", "value1"));
        builder.add(new Property<>("key2", "value2"));
        Map<String, Object> result = builder.getRootEntries();
        assertTrue(result.size() > 0);
    }

}