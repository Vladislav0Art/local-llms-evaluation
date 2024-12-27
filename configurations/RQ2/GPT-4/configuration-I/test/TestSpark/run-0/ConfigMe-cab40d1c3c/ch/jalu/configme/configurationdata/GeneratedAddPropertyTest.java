package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> prop = new StringProperty("SomePath", "DefaultValue");
        propertyListBuilder.add(prop);
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertTrue(rootEntries.containsKey("SomePath"));
    }

}