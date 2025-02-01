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

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist sl = new Safelist();
        sl.addTags("tag1");
        sl.addAttributes("tag1", "attr1");
        sl.removeAttributes("tag1", "attr1");
        Element el = new Element("tag1");
        Attribute attr = new Attribute("attr1", "value1");
        assertFalse(sl.isSafeAttribute("tag1", el, attr));
    }

}