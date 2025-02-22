package ch.jalu.configme.configurationdata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.List;

import org.junit.jupiter.api.Test;

public class GeneratedAddProperty_propertyAdded_sizeIncreased {

    private PropertyListBuilder builder = new PropertyListBuilder();

    @Test
    public void addProperty_propertyAdded_sizeIncreased() {
        builder.add(new Property<>("testProperty", "testPath"));
        assertEquals(1, builder.getRootEntries().size());
    }

}