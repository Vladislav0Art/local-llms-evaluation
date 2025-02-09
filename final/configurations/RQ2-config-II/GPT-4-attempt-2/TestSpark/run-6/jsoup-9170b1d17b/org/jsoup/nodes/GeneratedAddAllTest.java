package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes att1 = new Attributes();
        att1.put("key1", "value1");
        Attributes att2 = new Attributes();
        att2.put("key2", "value2");
        att1.addAll(att2);
        assertEquals(2, att1.size());
        assertEquals("value2", att1.get("key2"));
    }

}