package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.runner.RunWith;

public class GeneratedGetRootEntries_ReturnsNotNullMap {

    @Mock
    private List<Property<?>> mockProperties;

    @Mock
    private Map<String, Object> mockRootEntries;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getRootEntries_ReturnsNotNullMap() {
        when(mockRootEntries != null).thenReturn(new HashMap<>());
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> result = builder.getRootEntries();
        assertNotNull(result);
    }

}