package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetRootEntries_MapIsEmpty {

    @Mock
    private List<Property<?>> properties;

    @Test
    public void getRootEntries_MapIsEmpty() {
        Map<String, Object> entries = Mockito.mock(Map.class);
        when(entries.isEmpty()).thenReturn(true);
        PropertyListBuilder builder = new PropertyListBuilder();
        assertNotNull(builder.getRootEntries());
        assertEquals(0, ((Map<String, Object>) builder.getRootEntries()).size());
    }

}