package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GeneratedAddTags_addTags {

    @Test
    public void addTags_addTags() {
        Safelist safelist = Safelist.simpleText().addTags("strong", "em");
        assertTrue(safelist.isSafeTag("strong"));
        assertTrue(safelist.isSafeTag("em"));
    }

}