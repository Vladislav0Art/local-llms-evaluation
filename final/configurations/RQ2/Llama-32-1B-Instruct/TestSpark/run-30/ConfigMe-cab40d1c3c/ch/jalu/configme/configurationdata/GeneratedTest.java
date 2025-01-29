package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;

public class GeneratedTest {

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

    @Test
    public void testCreate_list() {
        String propertyName = "property1";
        Property<?> property = new Property(propertyName, null);

        List<Property<?>> list = PropertyListBuilder.create();

        assertNotNull(list);
        assertEquals(1, list.size());
        assertTrue(list.get(0) instanceof Property);
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

    @Test
    public void testAdd_without_property() {
        String propertyName = "property1";
        PropertyData propertyDataMock = new PropertyData();
        PropertyListBuilder.builder().setPropertyData(propertyDataMock).build();

        assertEquals(1, PropertyListBuilder.getRootEntries().size());
        assertTrue(PropertyListBuilder.getRootEntries().get(0) instanceof Property);
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

    @Test
    public void testGetRootEntries_without_property() {
        String propertyName = "property1";
        PropertyData propertyDataMock = new PropertyData();
        PropertyListBuilder.builder().setPropertyData(propertyDataMock).build();

        List<Property<?>> rootEntries = PropertyListBuilder.getRootEntries();

        assertNotNull(rootEntries);
        assertEquals(0, rootEntries.size());
    }

    @Test
    public void testCreate_list_without_property() {
        String propertyName = "property1";
        PropertyData propertyDataMock = new PropertyData();
        PropertyListBuilder.builder().setPropertyData(propertyDataMock).build();

        List<Property<?>> list = PropertyListBuilder.create();

        assertNotNull(list);
        assertEquals(0, list.size());
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