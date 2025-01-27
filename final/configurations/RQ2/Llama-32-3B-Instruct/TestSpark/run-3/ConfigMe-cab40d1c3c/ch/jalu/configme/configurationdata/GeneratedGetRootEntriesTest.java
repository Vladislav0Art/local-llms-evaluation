package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;

import java.util.Optional;

public class GeneratedGetRootEntriesTest {

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> entries = new LinkedHashMap<>();
        builder.getRootEntries().put("entry1", "value1");
        assertEquals(1, builder.getRootEntries().size());
    }

}