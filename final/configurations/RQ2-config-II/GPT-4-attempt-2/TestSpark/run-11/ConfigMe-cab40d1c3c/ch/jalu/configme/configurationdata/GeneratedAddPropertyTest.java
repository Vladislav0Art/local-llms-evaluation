package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.*;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new Property<>("property", "default");
        builder.add(property);
        List<Property<?>> properties = builder.create();
        assertEquals(1, properties.size());
        assertTrue(properties.contains(property));
    }

}