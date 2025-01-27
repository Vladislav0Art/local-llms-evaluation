package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesPropertyFound Test {

    @Test
    public void getRootEntriesPropertyFound

    Test() {
        Map<String, Object> entries = new HashMap<>();
        entries.put("test", "value");
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(entries, builder.getRootEntries());
    }

}