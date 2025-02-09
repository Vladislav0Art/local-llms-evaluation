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

public class GeneratedTest {

    @Test
    public void addKeyValPairTest() {
        Attributes att = new Attributes();
        att.add("key", "value");
        assertEquals("value", att.get("key"));
    }

    @Test
    public void putKeyValPairTest() {
        Attributes att = new Attributes();
        att.put("key", "value");
        assertEquals("value", att.get("key"));
    }

    @Test
    public void removeKeyTest() {
        Attributes att = new Attributes();
        att.put("key", "value");
        att.remove("key");
        assertEquals("", att.get("key"));
    }

    @Test
    public void hasKeyTest() {
        Attributes att = new Attributes();
        att.put("key", "value");
        assertTrue(att.hasKey("key"));
    }

    @Test
    public void sizeTest() {
        Attributes att = new Attributes();
        att.put("key", "value");
        assertEquals(1, att.size());
    }

    @Test
    public void isEmptyTest() {
        Attributes att = new Attributes();
        assertTrue(att.isEmpty());
    }

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

    @Test
    public void iteratorTest() {
        Attributes att = new Attributes();
        att.put("key", "value");
        Iterator<Attribute> it = att.iterator();
        assertTrue(it.hasNext());
    }

    @Test
    public void asListTest() {
        Attributes att = new Attributes();
        att.put("key", "value");
        List<Attribute> list = att.asList();
        assertEquals(1, list.size());
        assertEquals("key", list.get(0).getKey());
    }

    @Test
    public void datasetTest() {
        Attributes att = new Attributes();
        att.put("data-key", "value");
        Map<String, String> dataSet = att.dataset();
        assertEquals("value", dataSet.get("key"));
    }

    @Test
    public void htmlTest() throws IOException {
        Attributes att = new Attributes();
        att.put("key", "value");
        String html = att.html();
        assertTrue(html.contains("key=\"value\""));
    }

    @Test
    public void cloneTest() {
        Attributes att = new Attributes();
        att.put("key", "value");
        Attributes clonedAttributes = att.clone();
        assertEquals(att, clonedAttributes);
    }

    @Test
    public void normalizeTest() {
        Attributes att = new Attributes();
        att.put("KEY", "VALUE");
        att.normalize();
        assertEquals("VALUE", att.get("key"));
    }

    @Test
    public void deduplicateTest() {
        Attributes att = new Attributes();
        att.put("Key", "value1");
        att.put("key", "value2");
        att.deduplicate(ParseSettings.preserveCase);
        assertEquals(1, att.size());
    }

}