package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void addProperty() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new Property<>("test.path", String.class);

        builder.add(property);

        assertTrue(builder.getRootEntries().containsValue(property));
    }

    @Test
    public void addPropertyAlreadyExists() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new Property<>("test.path", String.class);

        builder.add(property);
        builder.add(property);
    }

    @Test
    public void addPropertyWithExistingPath() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new Property<>("test.path", String.class);
        Property<?> property2 = new Property<>("test.path.other", String.class);

        builder.add(property);
        builder.add(property2);
    }

}