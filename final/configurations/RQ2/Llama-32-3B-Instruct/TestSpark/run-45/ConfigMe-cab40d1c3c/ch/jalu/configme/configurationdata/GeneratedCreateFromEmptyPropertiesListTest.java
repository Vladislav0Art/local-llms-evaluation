package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateFromEmptyPropertiesListTest {

    @Mock
    private List<Property<?>> propertiesList;

    @Mock
    private Map<String, Object> rootMap;

    @Test
    public void createFromEmptyPropertiesListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> result = propertyListBuilder.create();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}