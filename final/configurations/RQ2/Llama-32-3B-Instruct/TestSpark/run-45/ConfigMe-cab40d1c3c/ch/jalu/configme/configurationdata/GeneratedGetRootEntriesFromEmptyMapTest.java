package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetRootEntriesFromEmptyMapTest {

    @Mock
    private List<Property<?>> propertiesList;

    @Mock
    private Map<String, Object> rootMap;

    @Test
    public void getRootEntriesFromEmptyMapTest() {
        Map<String, Object> rootMap = new LinkedHashMap<>();
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        when(rootMap).thenReturn(rootMap);
        Map<String, Object> result = propertyListBuilder.getRootEntries();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}