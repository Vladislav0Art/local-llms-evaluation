package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedGetChildMapNonExistentPathTest {

    @Test
    public void getChildMapNonExistentPathTest() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        Property<String> property = new Property<>("DataSource.type", "sqlite");
        builder.add(property);

        // Assert
        Map<String, Object> entries = builder.getRootEntries();
        assertTrue(entries.get("DataSource") instanceof Map<?, ?>);
    }

}