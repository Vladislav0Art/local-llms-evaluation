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

public class GeneratedSimpleText_SimpleTextSafe {

    @Test
    public void simpleText_SimpleTextSafe() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("h1"));
    }

}