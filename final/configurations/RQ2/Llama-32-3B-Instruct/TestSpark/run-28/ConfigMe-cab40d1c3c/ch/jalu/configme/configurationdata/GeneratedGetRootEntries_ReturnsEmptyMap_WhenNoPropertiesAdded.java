package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedGetRootEntries_ReturnsEmptyMap_WhenNoPropertiesAdded {

    @Test
    public void getRootEntries_ReturnsEmptyMap_WhenNoPropertiesAdded() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertTrue(rootEntries.size() == 0);
    }

}