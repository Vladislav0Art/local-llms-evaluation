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

Test_AddPropertyToEmptyRootEntries {

    @Mock
    private List<Property<?>> mockPropertyList;

    @Mock
    private Map<String, Object> mockRootEntries;

    @Test
    public void add[] Test_AddPropertyToEmptyRootEntries() {
        when(mockRootEntries.isEmpty()).thenReturn(true);
        PropertyListBuilder instance = new PropertyListBuilder();
        instance.add(Mockito.mock(Property.class));
        Map<String, Object> rootEntries = instance.getRootEntries();
        assertNotNull(rootEntries);
        assertTrue(rootEntries.containsKey("rootEntries"));
    }

}