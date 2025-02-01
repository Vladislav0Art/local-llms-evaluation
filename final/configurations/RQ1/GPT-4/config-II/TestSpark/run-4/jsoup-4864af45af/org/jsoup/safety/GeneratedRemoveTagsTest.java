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

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist sl = new Safelist();
        sl.addTags("tag1");
        sl.removeTags("tag1");
        assertFalse(sl.isSafeTag("tag1"));
    }

}