package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testGetElementsByTag() {
        Element element = mock(Element.class);
        when(element.getElementsByTag("tag")).thenReturn(new Elements());
        assertEquals(new Elements(), element.getElementsByTag("tag"));
    }

    @Test
    public void testGetElementById() {
        Element element = mock(Element.class);
        when(element.getElementById("id")).thenReturn(null);
        assertNull(element.getElementById("id"));
    }

    @Test
    public void testGetElementsByClass() {
        Element element = mock(Element.class);
        when(element.getElementsByClass("class")).thenReturn(new Elements());
        assertEquals(new Elements(), element.getElementsByClass("class"));
    }

    @Test
    public void testGetElementsByAttribute() {
        Element element = mock(Element.class);
        when(element.getElementsByAttribute("attribute")).thenReturn(new Elements());
        assertEquals(new Elements(), element.getElementsByAttribute("attribute"));
    }

    @Test
    public void testGetElementsByAttributeStarting() {
        Element element = mock(Element.class);
        when(element.getElementsByAttributeStarting("prefix")).thenReturn(new Elements());
        assertEquals(new Elements(), element.getElementsByAttributeStarting("prefix"));
    }

}