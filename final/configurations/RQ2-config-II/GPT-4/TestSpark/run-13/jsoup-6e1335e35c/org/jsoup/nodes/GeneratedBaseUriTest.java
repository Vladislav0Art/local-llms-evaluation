package org.jsoup.nodes;

import org.jsoup.helper.AttributeChangeListener;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedBaseUriTest {

    @Test
    public void baseUriTest() {
        Element element = new Element("div");
        assertTrue(element.baseUri().equals(""));
        element.attr("href", "http://test.com");
        assertTrue(element.baseUri().equals("http://test.com"));
    }

}