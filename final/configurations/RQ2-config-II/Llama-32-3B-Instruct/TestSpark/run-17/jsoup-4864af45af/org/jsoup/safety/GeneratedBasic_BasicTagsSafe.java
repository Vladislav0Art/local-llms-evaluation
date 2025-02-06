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

public class GeneratedBasic_BasicTagsSafe {

    @Test
    public void basic_BasicTagsSafe() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("b"));
    }

}