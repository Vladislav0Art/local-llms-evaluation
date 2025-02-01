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

public class GeneratedTest {

    @Test
    public void addTagsTest() {
        Safelist sl = new Safelist();
        sl.addTags("tag1");
        assertTrue(sl.isSafeTag("tag1"));
    }

    @Test
    public void removeTagsTest() {
        Safelist sl = new Safelist();
        sl.addTags("tag1");
        sl.removeTags("tag1");
        assertFalse(sl.isSafeTag("tag1"));
    }

    @Test
    public void addAttributesTest() {
        Safelist sl = new Safelist();
        sl.addTags("tag1");
        sl.addAttributes("tag1", "attr1");
        Element el = new Element("tag1");
        Attribute attr = new Attribute("attr1", "value1");
        assertTrue(sl.isSafeAttribute("tag1", el, attr));
    }

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

    @Test
    public void addEnforcedAttributeTest() {
        Safelist sl = new Safelist();
        sl.addEnforcedAttribute("tag1", "attr1", "value1");
        Attributes attrs = sl.getEnforcedAttributes("tag1");
        assertTrue(attrs.hasKey("attr1"));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist sl = new Safelist();
        sl.addEnforcedAttribute("tag1", "attr1", "value1");
        sl.removeEnforcedAttribute("tag1", "attr1");
        Attributes attrs = sl.getEnforcedAttributes("tag1");
        assertFalse(attrs.hasKey("attr1"));
    }

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

    @Test
    public void removeProtocolsTest() throws NoSuchFieldException, IllegalAccessException {
        Safelist sl = new Safelist();
        sl.addProtocols("tag1", "attr1", "http");
        sl.removeProtocols("tag1", "attr1", "http");
        Field f1 = Safelist.class.getDeclaredField("protocols");
        f1.setAccessible(true);
        Map f1Map = (Map) f1.get(sl);
        assertTrue(f1Map.containsKey(new Safelist.TagName("tag1")));
        Map f2Map = (Map) f1Map.get(new Safelist.TagName("tag1"));
        assertTrue(f2Map.containsKey(new Safelist.AttributeKey("attr1")));
        Set f3Set = (Set) f2Map.get(new Safelist.AttributeKey("attr1"));
        assertFalse(f3Set.contains(new Safelist.Protocol("http")));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist sl = new Safelist();
        sl.preserveRelativeLinks(true);
        Element el = new Element("tag1");
        Attribute attr = new Attribute("href", "#");
        assertTrue(sl.isSafeAttribute("tag1", el, attr));
    }

    @Test
    public void noneTest() {
        Safelist sl = Safelist.none();
        assertNotNull(sl);
    }

    @Test
    public void simpleTextTest() {
        Safelist sl = Safelist.simpleText();
        assertNotNull(sl);
    }

    @Test
    public void basicTest() {
        Safelist sl = Safelist.basic();
        assertNotNull(sl);
    }

    @Test
    public void basicWithImagesTest() {
        Safelist sl = Safelist.basicWithImages();
        assertNotNull(sl);
    }

    @Test
    public void relaxedTest() {
        Safelist sl = Safelist.relaxed();
        assertNotNull(sl);
    }

    @Test
    public void copyConstructorTest() {
        Safelist sl1 = new Safelist();
        sl1.addTags("tag1");
        Safelist sl2 = new Safelist(sl1);
        assertTrue(sl2.isSafeTag("tag1"));
    }

}