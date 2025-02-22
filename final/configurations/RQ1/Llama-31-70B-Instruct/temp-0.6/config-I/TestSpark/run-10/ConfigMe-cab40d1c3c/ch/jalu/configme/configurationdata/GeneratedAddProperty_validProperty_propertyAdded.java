package ch.jalu.configme.configurationdata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.List;

import org.junit.jupiter.api.Test;

public class GeneratedAddProperty_validProperty_propertyAdded {

    private PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void addProperty_validProperty_propertyAdded() {
        Property<String> property = new Property<>("testProperty", "testPath");
        builder.add(property);
        assertEquals(property, builder.getRootEntries().get("testPath"));
    }

}