package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedPut_singleKey {

    @Test
    public void put_singleKey() {
        Attributes attributes = new Attributes();
        String key = "key";
        String value = "value";
        attributes.put(key, value);
        assertEquals(value, attributes.get(key));
    }

}