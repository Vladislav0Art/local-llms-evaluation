package org.jsoup.nodes;

import org.jsoup.helper.AttributeChangeListener;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedTagNameNullTest {

    @Test
    public void tagNameNullTest() {
        try {
            Element element = new Element(null);
        } catch (IllegalArgumentException e) {
            assertEquals("tagName must not be null", e.getMessage());
        }
    }

}