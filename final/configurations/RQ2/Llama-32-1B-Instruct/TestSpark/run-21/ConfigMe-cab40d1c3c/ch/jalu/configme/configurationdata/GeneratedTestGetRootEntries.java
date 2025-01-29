package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito.*;

public class GeneratedTestGetRootEntries {

    @Test
    public void testGetRootEntries() {
        Mockito.when(getRootEntries()).thenReturn(new LinkedHashMap<>());
        Map<String, Object> rootEntries = getRootEntries();
        assertEquals(0, rootEntries.size());

        mapToString(rootEntries);
    }

    private Map<String, Object> getRootEntries() {
        return new LinkedHashMap<>();
    }

    private Map<String, Object> createProperties(Map<String, Object> rootEntries, int count) {
        for (int i = 0; i < count; i++) {
            Map.Entry<String, Object> entry = new AbstractMap.SimpleEntry<>("key", "value");
            rootEntries.put(entry.getKey(), entry.getValue());
        }
        return rootEntries;
    }

    private void mapToString(Map<String, Object> map) {
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    private int propertyCount = 0;

    public static class MapToString {
        public static void main(String[] args) {
            new PropertyListBuilder().setMapToString();
        }
    }

}