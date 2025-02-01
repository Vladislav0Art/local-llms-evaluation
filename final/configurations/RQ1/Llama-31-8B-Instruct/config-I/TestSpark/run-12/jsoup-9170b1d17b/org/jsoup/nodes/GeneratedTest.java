package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
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
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void get_SimpleAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        assertEquals("value", attributes.get("test"));
    }

    @Test
    public void getIgnoreCase_SimpleAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        assertEquals("value", attributes.getIgnoreCase("test"));
    }

    @Test
    public void getUserData_SimpleAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        assertEquals("value", attributes.getUserData("test"));
    }

    @Test
    public void getUserData_NullAttributeTest() {
        Attributes attributes = new Attributes();
        assertEquals(null, attributes.getUserData("test"));
    }

    @Test
    public void add_SimpleAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("test", "value");
        assertEquals("value", attributes.get("test"));
    }

    @Test
    public void put_SimpleAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        assertEquals("value", attributes.get("test"));
    }

    @Test
    public void putUserData_SimpleAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.putUserData("test", "value");
        assertEquals("value", attributes.getUserData("test"));
    }

    @Test
    public void putIgnoreCase_SimpleAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("test", "value");
        assertEquals("value", attributes.getIgnoreCase("test"));
    }

}