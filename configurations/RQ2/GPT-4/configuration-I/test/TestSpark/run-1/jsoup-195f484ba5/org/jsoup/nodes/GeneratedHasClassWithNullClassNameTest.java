package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.*;

import org.jsoup.nodes.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GeneratedHasClassWithNullClassNameTest {

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

}