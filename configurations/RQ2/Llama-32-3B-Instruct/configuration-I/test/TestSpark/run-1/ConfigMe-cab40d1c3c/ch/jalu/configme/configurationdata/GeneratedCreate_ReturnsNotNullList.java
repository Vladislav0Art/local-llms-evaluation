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

public class GeneratedCreate_ReturnsNotNullList {

    @Mock
    private List<Property<?>> mockProperties;

    @Mock
    private Map<String, Object> mockRootEntries;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void create_ReturnsNotNullList() {
        when(mockProperties != null).thenReturn(new ArrayList<>());
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> result = builder.create();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}