package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void addNullTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        thrown.expect(NullPointerException.class);
        builder.add(null);
    }

    @Test
    public void addPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new Property<String>("Test Path", "Default Value") {
            // Empty implementation for the anonymous class
        };
        builder.add(property);
        List<Property<?>> properties = builder.create();
        assertTrue(properties.contains(property));
    }

    @Test
    public void createEmptyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        assertTrue(properties.isEmpty());
    }

    @Test
    public void createAfterAddTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<?> property = new Property<String>("Test Path", "Default Value") {
            // Empty implementation for the anonymous class
        };
        builder.add(property);
        List<Property<?>> properties1 = builder.create();
        assertTrue(properties1.contains(property));

        Property<?> property2 = new Property<Integer>("Test Path", 1) {
            // Empty implementation for the anonymous class
        };
        builder.add(property2);
        List<Property<?>> properties2 = builder.create();
        assertTrue(properties2.contains(property2));
        assertEquals(properties1.size() + 1, properties2.size());
    }

}