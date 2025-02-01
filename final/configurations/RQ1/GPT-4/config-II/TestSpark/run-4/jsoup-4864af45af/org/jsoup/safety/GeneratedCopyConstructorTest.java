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

public class GeneratedCopyConstructorTest {

    @Test
    public void copyConstructorTest() {
        Safelist sl1 = new Safelist();
        sl1.addTags("tag1");
        Safelist sl2 = new Safelist(sl1);
        assertTrue(sl2.isSafeTag("tag1"));
    }

}