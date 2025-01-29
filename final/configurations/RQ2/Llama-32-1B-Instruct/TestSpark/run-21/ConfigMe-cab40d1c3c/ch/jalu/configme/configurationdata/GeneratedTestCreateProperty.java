package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito.*;

public class GeneratedTestCreateProperty {

    @Test
    public void testCreateProperty() {
        Mockito.when(getRootEntries()).thenReturn(new LinkedHashMap<>());
        Map<String, Object> rootEntries = getRootEntries();
        assertEquals(0, rootEntries.size());

        Map<String, Object> properties = createProperties(rootEntries, 1);

        assertEquals(0, properties.size());

        properties.put("key", "value");
        assertEquals(1, properties.size());
    }

}