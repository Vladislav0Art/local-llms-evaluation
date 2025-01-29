package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;

public class GeneratedTestGetRootEntries {

    private PropertyData propertyData;

    @Before
    public void setup() {
        propertyData = new PropertyData();
    }

    @Test
    public void testGetRootEntries() {
        String propertyName = "property1";
        Property<?> property = new Property(propertyName, null);

        List<Property<?>> rootEntries = PropertyListBuilder.getRootEntries();

        assertNotNull(rootEntries);
        assertEquals(1, rootEntries.size());
        assertTrue(rootEntries.get(0) instanceof Property);
    }

}