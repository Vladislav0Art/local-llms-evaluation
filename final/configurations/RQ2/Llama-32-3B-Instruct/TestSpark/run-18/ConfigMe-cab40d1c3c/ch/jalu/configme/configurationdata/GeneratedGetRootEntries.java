package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetRootEntries {

    @Test
    public void getRootEntries() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> map = builder.getRootEntries();
        assertTrue(map instanceof LinkedHashMap);
        assertEquals(0, ((LinkedHashMap<String, Object>) map).size());
    }

}