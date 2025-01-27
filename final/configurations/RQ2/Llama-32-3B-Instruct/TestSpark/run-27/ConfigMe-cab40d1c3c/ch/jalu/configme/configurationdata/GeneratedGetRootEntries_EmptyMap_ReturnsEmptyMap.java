package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntries_EmptyMap_ReturnsEmptyMap {

    @Test
    public void getRootEntries_EmptyMap_ReturnsEmptyMap() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> result = builder.getRootEntries();
        assertTrue(result.isEmpty());
    }

}