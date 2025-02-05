package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes original = new Attributes();
        original.put("key", "value");

        Attributes clone = original.clone();
        assertTrue(original.equals(clone));

        clone.remove("key");
        assertFalse(original.equals(clone));
    }

}