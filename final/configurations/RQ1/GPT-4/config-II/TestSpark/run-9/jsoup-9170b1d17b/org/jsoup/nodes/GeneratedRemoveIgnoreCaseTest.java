package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedRemoveIgnoreCaseTest {

    @Test
    public void removeIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.add("KEY", "value");
        attributes.removeIgnoreCase("key");

        assertEquals(0, attributes.size());
    }

}