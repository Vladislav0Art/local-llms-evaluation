package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class GeneratedGetRootEntriesWithMultipleProperties_ReturnsCorrectlyTest {

    @Test
    public void getRootEntriesWithMultipleProperties_ReturnsCorrectlyTest() {
        // Arrange
        Property<?> property1 = new Property<>("test1", "value1");
        Property<?> property2 = new Property<>("test2", "value2");
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        builder.add(property1);
        builder.add(property2);
        rootEntries = builder.getRootEntries();

        // Assert
        assertEquals(2, rootEntries.size());
    }

}