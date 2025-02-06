package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedAddTags_addsTagsTest {

    @Test
    public void addTags_addsTagsTest() {
        Safelist safelist = Safelist.addTags("p", "span");
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("span"));
    }

}