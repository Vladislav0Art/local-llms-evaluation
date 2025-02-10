package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesTest {

    public PropertyListBuilderTest() {
    }

    @Test
    public void getRootEntriesTest() {
        Map<String, Object> rootEntries = new HashMap<>();
        rootEntries.put("key", "value");
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(rootEntries, builder.getRootEntries());
    }

}