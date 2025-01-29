package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;

public class GeneratedTestAdd_property {

    private PropertyData propertyData;

    @Before
    public void setup() {
        propertyData = new PropertyData();
    }

    @Test
    public void testAdd_property() {
        String propertyName = "property1";
        Property<?> property = new Property(propertyName, null);
        PropertyListBuilder.builder().add(property).build();

        assertEquals(1, PropertyListBuilder.getRootEntries().size());
        assertTrue(PropertyListBuilder.getRootEntries().get(0) instanceof Property);
    }

}