package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRelaxed_AddsImagesToSafeListTest {

    @Test
    public void relaxed_AddsImagesToSafeListTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.addTags("img").isEmpty());
    }

}