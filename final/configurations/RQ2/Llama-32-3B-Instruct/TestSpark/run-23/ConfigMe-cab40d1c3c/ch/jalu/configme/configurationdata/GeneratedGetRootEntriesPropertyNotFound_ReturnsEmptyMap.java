package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesPropertyNotFound_ReturnsEmptyMap {

    @Test
    public void getRootEntriesPropertyNotFound_ReturnsEmptyMap() {
        Map<String, Object> entries = new HashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(entries, builder.getRootEntries());
    }

}