package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedBasic_AddsEmptyTagsToListTest {

    @Test
    public void basic_AddsEmptyTagsToListTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.addTags().isEmpty());
    }

}