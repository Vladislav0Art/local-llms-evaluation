package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddProperty {

    @Test
    public void addProperty() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new Property<>("test.path", String.class);

        builder.add(property);

        assertTrue(builder.getRootEntries().containsValue(property));
    }

}