package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedRemoveTest {

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");

        assertFalse(attributes.hasKey("key"));
    }

}