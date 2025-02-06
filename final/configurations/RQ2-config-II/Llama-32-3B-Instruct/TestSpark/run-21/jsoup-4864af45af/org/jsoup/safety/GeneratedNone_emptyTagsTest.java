package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedNone_emptyTagsTest {

    @Test
    public void none_emptyTagsTest() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag(""));
    }

}