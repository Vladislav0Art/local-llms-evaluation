package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private Attributes attributes;

    @Test
    public void indexOfKey_EmptyAttributes_ReturnsMinusOne() {
        assertEquals(-1, attributes.indexOfKey("key"));
    }

    @Test
    public void indexOfKey_ExistingKey_ReturnsIndex() {
        attributes.add("key", "value");
        assertEquals(0, attributes.indexOfKey("key"));
    }

    @Test
    public void indexOfKey_NonExistingKey_ReturnsMinusOne() {
        assertEquals(-1, attributes.indexOfKey("nonExistingKey"));
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
    public void get_EmptyAttributes_ReturnsNull() {
        assertEquals(null, attributes.get("key"));
    }

    @Test
    public void get_ExistingKey_ReturnsValue() {
        attributes.add("key", "value");
        assertEquals("value", attributes.get("key"));
    }

    @Test
    public void get_NonExistingKey_ReturnsNull() {
        assertEquals(null, attributes.get("nonExistingKey"));
    }

    @Test
    public void getIgnoreCase_EmptyAttributes_ReturnsNull() {
        assertEquals(null, attributes.getIgnoreCase("key"));
    }

    @Test
    public void getIgnoreCase_ExistingKey_ReturnsValue() {
        attributes.add("key", "value");
        assertEquals("value", attributes.getIgnoreCase("key"));
    }

    @Test
    public void getIgnoreCase_NonExistingKey_ReturnsNull() {
        assertEquals(null, attributes.getIgnoreCase("nonExistingKey"));
    }

}