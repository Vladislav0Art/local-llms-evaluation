package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private List<Property<?>> propertiesList;

    @Mock
    private Map<String, Object> rootMap;

    @Test
    public void addPropertyToEmptyPropertiesListTest() {
        Property property = new Property("test", "value");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);
        assertEquals(1, propertiesList.size());
    }

    @Test
    public void createFromEmptyPropertiesListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> result = propertyListBuilder.create();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void addPropertyToExistingPropertiesListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property property1 = new Property("test1", "value");
        Property property2 = new Property("test2", "value");
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);
        assertEquals(2, propertiesList.size());
    }

    @Test
    public void createFromExistingPropertiesListTest() {
        List<Property<?>> propertiesList = new ArrayList<>();
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        when(propertiesList).thenReturn(propertiesList);
        List<Property<?>> result = propertyListBuilder.create();
        assertEquals(0, result.size());
    }

    @Test
    public void getRootEntriesFromEmptyMapTest() {
        Map<String, Object> rootMap = new LinkedHashMap<>();
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        when(rootMap).thenReturn(rootMap);
        Map<String, Object> result = propertyListBuilder.getRootEntries();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void getRootEntriesFromNonEmptyMapTest() {
        Map<String, Object> rootMap = new LinkedHashMap<>();
        rootMap.put("test", "value");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        when(rootMap).thenReturn(rootMap);
        Map<String, Object> result = propertyListBuilder.getRootEntries();
        assertNotNull(result);
        assertEquals(1, ((LinkedHashMap<?>) result).size());
    }

}