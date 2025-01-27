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

Test_RootEntries {

    @Mock
    private List<Property<?>> mockPropertyList;

    @Mock
    private Map<String, Object> mockRootEntries;

    @Test
    public void create[] Test_RootEntries() {
        when(mockRootEntries).thenReturn(new HashMap<>());
        PropertyListBuilder instance = new PropertyListBuilder();
        List<Property<?>> result = instance.create(mockRootEntries);
        assertNotNull(result);
        assertTrue(((Map<String, Object>) result.get(0)).containsKey("rootEntries"));
    }

}