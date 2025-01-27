package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class GeneratedGetRootEntries_NoProperty_ReturnsEmptyMapTest {

    @Test
    public void getRootEntries_NoProperty_ReturnsEmptyMapTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> rootEntries = builder.getRootEntries();

        // Act
        assertEquals(0, rootEntries.size());
    }

}