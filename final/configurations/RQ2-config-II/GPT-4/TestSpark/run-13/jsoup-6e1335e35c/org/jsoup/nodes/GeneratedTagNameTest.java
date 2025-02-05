package org.jsoup.nodes;

import org.jsoup.helper.AttributeChangeListener;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element element = new Element("div");
        assertTrue(element.tagName().equals("div"));
    }

}