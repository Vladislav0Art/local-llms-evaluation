package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.*;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GeneratedAppendWithNullHtmlTest {

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

}