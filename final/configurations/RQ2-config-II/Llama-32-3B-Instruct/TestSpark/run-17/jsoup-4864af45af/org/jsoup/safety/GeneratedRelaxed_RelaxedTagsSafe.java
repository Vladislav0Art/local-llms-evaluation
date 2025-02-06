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

public class GeneratedRelaxed_RelaxedTagsSafe {

    @Test
    public void relaxed_RelaxedTagsSafe() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("span"));
    }

}