package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesTest {

    @Test
    public void getRootEntriesTest() {
        // Arrange & Act
        Map<String, Object> expected = new LinkedHashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        // No actual calls here since this method is protected

        // Assert
        assertEquals(expected, builder.getRootEntries());
    }

}