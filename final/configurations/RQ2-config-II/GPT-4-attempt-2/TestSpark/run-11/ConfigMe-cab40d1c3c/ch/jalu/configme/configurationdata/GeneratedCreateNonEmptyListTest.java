package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.*;

public class GeneratedCreateNonEmptyListTest {

    @Test
    public void createNonEmptyListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new Property<>("property1", "default1"));
        builder.add(new Property<>("property2", "default2"));
        List<Property<?>> properties = builder.create();
        assertEquals(2, properties.size());
    }

}