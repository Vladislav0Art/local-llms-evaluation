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
public class GeneratedAdd[]

Test_AddPropertyToNonEmptyRootEntries {

    @Mock
    private List<Property<?>> mockPropertyList;

    @Mock
    private Map<String, Object> mockRootEntries;

    @Test
    public void add[] Test_AddPropertyToNonEmptyRootEntries() {
        when(mockRootEntries.isEmpty()).thenReturn(false);
        PropertyListBuilder instance = new PropertyListBuilder();
        Map<String, Object> rootEntries = new HashMap<>();
        rootEntries.put("property1", Mockito.mock(Object.class));
        rootEntries.put("property2", Mockito.mock(Object.class));
        instance.add(Mockito.mock(Property.class));
        Map<String, Object> resultRootEntries = instance.getRootEntries();
        assertNotNull(resultRootEntries);
        assertTrue(resultRootEntries.containsKey("rootEntries"));
    }

}