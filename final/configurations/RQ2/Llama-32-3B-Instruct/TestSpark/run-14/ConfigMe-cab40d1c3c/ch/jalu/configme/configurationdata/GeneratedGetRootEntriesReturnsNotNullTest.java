package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesReturnsNotNullTest {

    @Test
    public void getRootEntriesReturnsNotNullTest() {
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(0, ((PropertyListBuilder) new PropertyListBuilder()).getRootEntries().size());
        builder.add(new Property<>("key1", "value1"));
        builder.add(new Property<>("key2", "value2"));
        Map<String, Object> result = builder.getRootEntries();
        assertNotNull(result);
    }

}