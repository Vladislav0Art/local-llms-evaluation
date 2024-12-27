package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.*;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GeneratedPrependTextWithNullTest {

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

}