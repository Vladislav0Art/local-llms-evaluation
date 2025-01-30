package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddSinglePropertyTest {

    @Test
    public void addSinglePropertyTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new StringProperty("DataSource.url", "jdbc:mysql://localhost:3306/test");

        // When
        propertyListBuilder.add(property);

        // Then
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertTrue(rootEntries.containsKey("DataSource"));

        Map<String, Object> dataSourceMap = (Map<String, Object>) rootEntries.get("DataSource");
        assertEquals(dataSourceMap.get("url"), property);
    }

}