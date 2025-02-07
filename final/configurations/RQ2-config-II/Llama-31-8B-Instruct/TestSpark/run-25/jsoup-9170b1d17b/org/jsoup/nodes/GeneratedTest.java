package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.Appendable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void indexOfKey_EmptyAttributes_ReturnsMinusOne() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey("key"));
    }

    @Test
    public void indexOfKey_KeyExists_ReturnsIndex() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals(0, attributes.indexOfKey("key"));
    }

    @Test
    public void indexOfKey_KeyDoesNotExist_ReturnsMinusOne() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey("key"));
    }

    @Test
    public void checkNotNull_NullValue_ReturnsNull() {
        assertEquals(null, Attributes.checkNotNull(null));
    }

    @Test
    public void checkNotNull_NotNullValue_ReturnsValue() {
        assertEquals("value", Attributes.checkNotNull("value"));
    }

    @Test
    public void get_KeyExists_ReturnsValue() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void get_KeyDoesNotExist_ReturnsNull() {
        Attributes attributes = new Attributes();
        assertEquals(null, attributes.get("key"));
    }

    @Test
    public void getIgnoreCase_KeyExists_ReturnsValue() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.getIgnoreCase("key"));
    }

    @Test
    public void getIgnoreCase_KeyDoesNotExist_ReturnsNull() {
        Attributes attributes = new Attributes();
        assertEquals(null, attributes.getIgnoreCase("key"));
    }

}