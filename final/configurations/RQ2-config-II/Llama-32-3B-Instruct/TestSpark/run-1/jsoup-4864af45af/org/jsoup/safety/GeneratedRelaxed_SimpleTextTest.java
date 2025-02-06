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

public class GeneratedRelaxed_SimpleTextTest {

    @Test
    public void relaxed_SimpleTextTest() {
        Safelist relaxed = Safelist.relaxed();
        assertTrue(relaxed.isSafeTag("img"));
        assertTrue(relaxed.isSafeTag("p"));
    }

}