package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GeneratedRelaxed_SimpleTagsTest {

    @Test
    public void relaxed_SimpleTagsTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("script"));
        assertTrue(safelist.isSafeTag("iframe"));
    }

}