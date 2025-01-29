package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;

public class GeneratedTestCreate_list {

    private PropertyData propertyData;

    @Before
    public void setup() {
        propertyData = new PropertyData();
    }

    @Test
    public void testCreate_list() {
        String propertyName = "property1";
        Property<?> property = new Property(propertyName, null);

        List<Property<?>> list = PropertyListBuilder.create();

        assertNotNull(list);
        assertEquals(1, list.size());
        assertTrue(list.get(0) instanceof Property);
    }

}