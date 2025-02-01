package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new TypicalProperty();

        propertyListBuilder.add(property);
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertTrue(rootEntries.containsKey("test_property"));
    }

}