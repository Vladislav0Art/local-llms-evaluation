package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addTest_PropertyIsNull_ExpectConfigMeException() {
        propertyListBuilder.add(null);
    }

    @Test
    public void addTest_PropertyIsNotNull_ExpectPropertyAdded() {
        Property<?> property = Mockito.mock(Property.class);
        propertyListBuilder.add(property);
        // TODO: Assert that the property was added
    }

    @Test
    public void createTest_PropertiesExist_ExpectListCreated() {
        Property<?> property = Mockito.mock(Property.class);
        propertyListBuilder.add(property);
        List<Property<?>> propertyList = propertyListBuilder.create();
        assertEquals(1, propertyList.size());
    }

    @Test
    public void createTest_PropertiesDoNotExist_ExpectEmptyList() {
        List<Property<?>> propertyList = propertyListBuilder.create();
        assertEquals(0, propertyList.size());
    }

    @Test
    public void getRootEntriesTest_NoRootEntries_ExpectEmptyMap() {
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertEquals(0, rootEntries.size());
    }

}