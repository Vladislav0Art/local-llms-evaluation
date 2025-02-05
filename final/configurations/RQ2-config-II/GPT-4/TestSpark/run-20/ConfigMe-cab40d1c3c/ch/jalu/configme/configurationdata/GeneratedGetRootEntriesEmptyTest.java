package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

public class GeneratedGetRootEntriesEmptyTest {

    @Test
    public void getRootEntriesEmptyTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        Map<String, Object> rootEntries = builder.getRootEntries();

        // Assert
        assertTrue(rootEntries.isEmpty());
    }

}