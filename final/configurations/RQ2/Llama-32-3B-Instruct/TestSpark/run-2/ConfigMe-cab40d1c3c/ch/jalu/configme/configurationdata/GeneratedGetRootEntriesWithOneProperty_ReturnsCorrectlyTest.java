package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class GeneratedGetRootEntriesWithOneProperty_ReturnsCorrectlyTest {

    @Test
    public void getRootEntriesWithOneProperty_ReturnsCorrectlyTest() {
        // Arrange
        Property<?> property = new Property<>("test", "value");
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        builder.add(property);
        rootEntries = builder.getRootEntries();

        // Assert
        assertEquals(1, rootEntries.size());
    }

}