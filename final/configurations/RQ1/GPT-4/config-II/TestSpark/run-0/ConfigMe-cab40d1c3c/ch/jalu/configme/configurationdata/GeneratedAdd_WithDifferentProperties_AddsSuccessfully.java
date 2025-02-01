package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAdd_WithDifferentProperties_AddsSuccessfully {

    @Test
    public void add_WithDifferentProperties_AddsSuccessfully() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property1 = new Property<>(() -> "default", "path.to.value1");
        Property<String> property2 = new Property<>(() -> "default2", "path.to.value2");

        // Should not fail
        builder.add(property1);
        builder.add(property2);

        // get root entries for verifying addition
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertTrue(rootEntries.containsKey("path"));
    }

}