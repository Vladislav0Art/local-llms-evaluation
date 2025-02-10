package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedCreateRootEntriesTest TestCreateRootEntries {

    @Test
    public void createRootEntriesTest

    TestCreateRootEntries() {
        Map<String, Object> rootEntries = new HashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(rootEntries, builder.getRootEntries());
    }

}