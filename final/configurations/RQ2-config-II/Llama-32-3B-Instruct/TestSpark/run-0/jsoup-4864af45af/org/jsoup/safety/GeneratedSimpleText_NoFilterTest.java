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

public class GeneratedSimpleText_NoFilterTest {

    @Test
    public void simpleText_NoFilterTest() {
        Safelist safelist = Safelist.simpleText();
        assertFalse(safelist.isSafeTag("script"));
    }

}