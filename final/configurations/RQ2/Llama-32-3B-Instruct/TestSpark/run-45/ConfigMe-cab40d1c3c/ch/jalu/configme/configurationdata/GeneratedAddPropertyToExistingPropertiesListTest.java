package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddPropertyToExistingPropertiesListTest {

    @Mock
    private List<Property<?>> propertiesList;

    @Mock
    private Map<String, Object> rootMap;

    @Test
    public void addPropertyToExistingPropertiesListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property property1 = new Property("test1", "value");
        Property property2 = new Property("test2", "value");
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);
        assertEquals(2, propertiesList.size());
    }

}