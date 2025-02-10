package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddPropertyToEmptyPropertiesListTest {

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

}