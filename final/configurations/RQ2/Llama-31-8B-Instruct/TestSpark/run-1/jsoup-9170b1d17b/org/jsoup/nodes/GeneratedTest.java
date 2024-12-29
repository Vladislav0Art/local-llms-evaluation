package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

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
    public void checkNotNull_Null_ReturnsNull() {
        assertNull(Attributes.checkNotNull(null));
    }

    @Test
    public void checkNotNull_NotNull_ReturnsValue() {
        String value = "value";
        assertEquals(value, Attributes.checkNotNull(value));
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
        assertNull(attributes.get("key"));
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
        assertNull(attributes.getIgnoreCase("key"));
    }

}