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

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist sl = new Safelist();
        sl.addTags("tag1");
        assertTrue(sl.isSafeTag("tag1"));
    }

}