package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddNewPropertyTest {

    @Test
    public void addNewPropertyTest() {
        // Given
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<Boolean> property = new Property<>("keyA.keyB.PropertyOne",
                false);
        // When
        builder.add(property);
        // Then
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertTrue(rootEntries.get("keyA") instanceof Map);
        assertTrue(((Map) rootEntries.get("keyA")).get("keyB") instanceof Map);
        assertSame(property, ((Map) ((Map) rootEntries.get("keyA"))
                .get("keyB")).get("PropertyOne"));
    }

}