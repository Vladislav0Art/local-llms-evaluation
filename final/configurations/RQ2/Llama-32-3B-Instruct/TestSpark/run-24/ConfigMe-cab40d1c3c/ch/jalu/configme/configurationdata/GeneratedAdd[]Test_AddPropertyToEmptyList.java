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

Test_AddPropertyToEmptyList {

    @Mock
    private List<Property<?>> mockPropertyList;

    @Mock
    private Map<String, Object> mockRootEntries;

    @Test
    public void add[] Test_AddPropertyToEmptyList() {
        when(mockPropertyList.isEmpty()).thenReturn(false);
        PropertyListBuilder instance = new PropertyListBuilder();
        instance.add(Mockito.mock(Property.class));
        List<Property<?>> result = instance.create();
        assertNotNull(result);
        assertTrue(result.contains(Mockito.mock(Property.class)));
    }

}