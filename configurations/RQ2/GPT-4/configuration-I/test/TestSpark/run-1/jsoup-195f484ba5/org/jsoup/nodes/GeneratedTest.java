package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.*;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GeneratedTest {

    @Test
    public void tagNameWithNullTest() {
        Element element = new Element("div");

        try {
            element.tagName(null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Tag name must not be null.", e.getMessage());
        }
    }

    @Test
    public void prependChildWithNullTest() {
        Element element = new Element("div");

        try {
            element.prependChild(null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Child element must not be null.", e.getMessage());
        }
    }

    @Test
    public void prependTextWithNullTest() {
        Element element = new Element("div");

        try {
            element.prependText(null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Text must not be null.", e.getMessage());
        }
    }

    @Test
    public void appendWithNullHtmlTest() {
        Element element = new Element("div");

        try {
            element.append(null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Html must not be null.", e.getMessage());
        }
    }

    @Test
    public void hasClassWithNullClassNameTest() {
        Element element = new Element("div");

        try {
            element.hasClass(null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Class name must not be null.", e.getMessage());
        }
    }

    @Test
    public void addClassWithNullClassNameTest() {
        Element element = new Element("div");

        try {
            element.addClass(null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Class name must not be null.", e.getMessage());
        }
    }

    @Test
    public void removeClassWithNullClassNameTest() {
        Element element = new Element("div");

        try {
            element.removeClass(null);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Class name must not be null.", e.getMessage());
        }
    }

}