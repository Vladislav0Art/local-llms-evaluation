package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito.*;

public class GeneratedTestCreatePropertyMultiple {

    @Test
    public void testCreatePropertyMultiple() {
        Mockito.when(getRootEntries()).thenReturn(new LinkedHashMap<>());
        Map<String, Object> rootEntries = getRootEntries();
        assertEquals(0, rootEntries.size());

        Map<String, Object> properties = createProperties(rootEntries, 2);

        assertEquals(1, properties.size());
    }

}