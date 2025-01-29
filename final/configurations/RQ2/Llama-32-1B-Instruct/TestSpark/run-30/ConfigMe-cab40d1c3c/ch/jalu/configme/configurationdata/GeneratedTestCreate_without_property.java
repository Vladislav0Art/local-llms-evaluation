package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;

public class GeneratedTestCreate_without_property {

    private PropertyData propertyData;

    @Before
    public void setup() {
        propertyData = new PropertyData();
    }

    @Test
    public void testCreate_without_property() {
        String propertyName = "property1";
        PropertyData propertyDataMock = new PropertyData();
        PropertyListBuilder.builder().setPropertyData(propertyDataMock).build();

        List<Property<?>> list = PropertyListBuilder.create();

        assertNotNull(list);
        assertEquals(0, list.size());
    }

}