package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddPropertyWithoutExistingPathTest {

    @Test
    public void addPropertyWithoutExistingPathTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new Property<>("my.test.property", "default");

        builder.add(property);
        Map<String, Object> rootEntries = builder.getRootEntries();

        assertTrue(rootEntries.containsKey("my"));
        assertTrue(((Map) rootEntries.get("my")).containsKey("test"));
        assertTrue(((Map) ((Map) rootEntries.get("my")).get("test")).containsKey("property"));
        assertSame(property, ((Map) ((Map) rootEntries.get("my")).get("test")).get("property"));
    }

}