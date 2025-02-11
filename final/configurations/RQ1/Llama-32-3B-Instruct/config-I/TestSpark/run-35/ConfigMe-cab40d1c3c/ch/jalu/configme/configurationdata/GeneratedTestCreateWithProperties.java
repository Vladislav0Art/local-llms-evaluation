package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCreateWithProperties {

    @Mock
    private Map<String, Object> mockRootEntries;

    public void testAddPropertyToEmptyMap() {
        when(mockRootEntries).thenReturn(new HashMap<>());
        new PropertyListBuilder().add(new Property<>("path", "value"));
        verify(mockRootEntries).put("path", null);
    }

    @Test
    public void testCreateWithProperties() {
        Map<String, Object> map = new HashMap<>();
        when(mockRootEntries).thenReturn(map);
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new Property<>("path1", "value"));
        builder.add(new Property<>("path2.value", "value2"));
        List<Property<?>> result = builder.create();
        assertEquals(2, result.size());
    }

    public void testGetRootEntries() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertNotNull(rootEntries);
        assertTrue(rootEntries instanceof HashMap);
    }

}