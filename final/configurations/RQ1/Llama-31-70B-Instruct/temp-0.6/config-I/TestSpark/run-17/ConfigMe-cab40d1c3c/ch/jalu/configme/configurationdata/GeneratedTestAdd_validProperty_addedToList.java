package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.PropertyBuilder;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestAdd_validProperty_addedToList {

    private PropertyListBuilder listBuilder;

    @Before
    public void setUp() {
        listBuilder = new PropertyListBuilder();
    }

    @Test
    public void testAdd_validProperty_addedToList() {
        Property<?> property = new PropertyBuilder<>("DataSource.mysql.port").build();

        listBuilder.add(property);

        List<Property<?>> properties = listBuilder.create();
        assertEquals(1, properties.size());
        assertTrue(properties.contains(property));
    }

}