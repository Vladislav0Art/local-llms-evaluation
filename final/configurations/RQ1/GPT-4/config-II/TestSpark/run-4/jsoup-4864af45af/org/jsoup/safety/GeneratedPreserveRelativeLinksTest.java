package org.jsoup.safety;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist sl = new Safelist();
        sl.preserveRelativeLinks(true);
        Element el = new Element("tag1");
        Attribute attr = new Attribute("href", "#");
        assertTrue(sl.isSafeAttribute("tag1", el, attr));
    }

}