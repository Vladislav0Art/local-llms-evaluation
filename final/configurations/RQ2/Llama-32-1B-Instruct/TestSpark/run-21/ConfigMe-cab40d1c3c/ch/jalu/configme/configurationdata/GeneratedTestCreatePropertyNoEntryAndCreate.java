package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito.*;

public class GeneratedTestCreatePropertyNoEntryAndCreate {

    @Test
    public void testCreatePropertyNoEntryAndCreate() {
        Mockito.when(getRootEntries()).thenReturn(new LinkedHashMap<>());
        Map<String, Object> rootEntries = getRootEntries();
        assertEquals(0, rootEntries.size());

        createProperties(rootEntries, 1);

        assertEquals(1, propertyCount);
    }

}