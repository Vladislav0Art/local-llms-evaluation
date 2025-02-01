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

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist sl = new Safelist();
        sl.addEnforcedAttribute("tag1", "attr1", "value1");
        sl.removeEnforcedAttribute("tag1", "attr1");
        Attributes attrs = sl.getEnforcedAttributes("tag1");
        assertFalse(attrs.hasKey("attr1"));
    }

}