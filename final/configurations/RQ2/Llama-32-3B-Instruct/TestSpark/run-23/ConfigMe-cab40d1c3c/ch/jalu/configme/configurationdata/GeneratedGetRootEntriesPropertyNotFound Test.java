package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesPropertyNotFound Test {

    @Test
    public void getRootEntriesPropertyNotFound

    Test() {
        Map<String, Object> entries = new HashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(0, builder.getRootEntries().size());
    }

}