package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateFromExistingPropertiesListTest {

    @Mock
    private List<Property<?>> propertiesList;

    @Mock
    private Map<String, Object> rootMap;

    @Test
    public void createFromExistingPropertiesListTest() {
        List<Property<?>> propertiesList = new ArrayList<>();
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        when(propertiesList).thenReturn(propertiesList);
        List<Property<?>> result = propertyListBuilder.create();
        assertEquals(0, result.size());
    }

}