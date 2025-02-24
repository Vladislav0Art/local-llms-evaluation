package ch.jalu.configme.configurationdata;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void getRootEntriesTest() {
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assert (rootEntries instanceof LinkedHashMap);
    }

}