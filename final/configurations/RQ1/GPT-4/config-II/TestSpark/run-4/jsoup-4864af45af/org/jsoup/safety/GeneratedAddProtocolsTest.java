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

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() throws NoSuchFieldException, IllegalAccessException {
        Safelist sl = new Safelist();
        sl.addProtocols("tag1", "attr1", "http");
        Field f1 = Safelist.class.getDeclaredField("protocols");
        f1.setAccessible(true);
        Map f1Map = (Map) f1.get(sl);
        assertTrue(f1Map.containsKey(new Safelist.TagName("tag1")));
        Map f2Map = (Map) f1Map.get(new Safelist.TagName("tag1"));
        assertTrue(f2Map.containsKey(new Safelist.AttributeKey("attr1")));
        Set f3Set = (Set) f2Map.get(new Safelist.AttributeKey("attr1"));
        assertTrue(f3Set.contains(new Safelist.Protocol("http")));
    }

}