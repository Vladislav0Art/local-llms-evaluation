package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntries_emptyMapTest {

    @Test
    public void getRootEntries_emptyMapTest() {
        Map<String, Object> map = Collections.emptyMap();
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(Collections.emptyMap(), builder.getRootEntries());
    }

}