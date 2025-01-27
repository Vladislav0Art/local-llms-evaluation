package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreate[]

Test_AddPropertiesToRootEntries {

    @Mock
    private List<Property<?>> mockPropertyList;

    @Mock
    private Map<String, Object> mockRootEntries;

    @Test
    public void create[] Test_AddPropertiesToRootEntries() {
        when(mockPropertyList.isEmpty()).thenReturn(false);
        PropertyListBuilder instance = new PropertyListBuilder();
        Map<String, Object> rootEntries = Mockito.mock(Map.class);
        instance.add(Mockito.mock(Property.class));
        instance.add(Mockito.mock(Property.class));
        List<Property<?>> result = instance.create(rootEntries);
        assertNotNull(result);
        assertTrue(((Map<String, Object>) result.get(0)).containsKey("rootEntries"));
    }

}