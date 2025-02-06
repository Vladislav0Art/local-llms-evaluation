package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GeneratedAddTags_MultipleTagsAddedTest {

    @Test
    public void addTags_MultipleTagsAddedTest() {
        Safelist safelist = Safelist.addTags("a", "img");
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("img"));
    }

}