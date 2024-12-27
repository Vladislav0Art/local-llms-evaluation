package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.*;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GeneratedPrependChildWithNullTest {

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

}