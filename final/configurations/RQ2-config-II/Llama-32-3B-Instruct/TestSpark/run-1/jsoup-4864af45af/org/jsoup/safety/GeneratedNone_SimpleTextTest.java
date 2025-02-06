package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;

public class GeneratedNone_SimpleTextTest {

    @Test
    public void none_SimpleTextTest() {
        Safelist simple = Safelist.simpleText();
        assertFalse(simple.isSafeTag("img"));
        assertTrue(simple.isSafeTag("p"));
    }

}