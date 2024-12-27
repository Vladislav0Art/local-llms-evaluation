package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.*;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GeneratedTagNameWithNullTest {

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

}