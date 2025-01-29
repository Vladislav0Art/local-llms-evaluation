package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;

public class GeneratedTestGetRootEntries_without_property {

    private PropertyData propertyData;

    @Before
    public void setup() {
        propertyData = new PropertyData();
    }

    @Test
    public void testGetRootEntries_without_property() {
        String propertyName = "property1";
        PropertyData propertyDataMock = new PropertyData();
        PropertyListBuilder.builder().setPropertyData(propertyDataMock).build();

        List<Property<?>> rootEntries = PropertyListBuilder.getRootEntries();

        assertNotNull(rootEntries);
        assertEquals(0, rootEntries.size());
    }

}