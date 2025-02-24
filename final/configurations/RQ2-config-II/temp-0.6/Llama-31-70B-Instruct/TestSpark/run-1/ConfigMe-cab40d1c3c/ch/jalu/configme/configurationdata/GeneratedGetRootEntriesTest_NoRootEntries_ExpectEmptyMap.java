package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesTest_NoRootEntries_ExpectEmptyMap {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void getRootEntriesTest_NoRootEntries_ExpectEmptyMap() {
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertEquals(0, rootEntries.size());
    }

}