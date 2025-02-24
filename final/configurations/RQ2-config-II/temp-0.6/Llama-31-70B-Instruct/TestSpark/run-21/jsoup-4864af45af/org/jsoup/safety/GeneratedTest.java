package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;

import static org.junit.Assert.*;

public class GeneratedTest {

    private Safelist safelist = new Safelist();

    @Test
    public void isSafeTagTest() {
        assertTrue(safelist.isSafeTag("div"));
    }

    @Test
    public void isSafeAttributeTest() {
        Element element = new Element("div");
        Attribute attribute = new Attribute("id", "test");
        assertTrue(safelist.isSafeAttribute("div", element, attribute));
    }

    @Test
    public void getEnforcedAttributesTest() {
        assertNotNull(safelist.getEnforcedAttributes("div"));
    }

    @Test
    public void addTagsTest() {
        String[] tags = {"div", "span"};
        Safelist newSafelist = safelist.addTags(tags);
        assertNotNull(newSafelist);
    }

    @Test
    public void removeTagsTest() {
        String[] tags = {"div", "span"};
        Safelist newSafelist = safelist.removeTags(tags);
        assertNotNull(newSafelist);
    }

    @Test
    public void addAttributesTest() {
        String tag = "div";
        String[] attributes = {"id", "class"};
        Safelist newSafelist = safelist.addAttributes(tag, attributes);
        assertNotNull(newSafelist);
    }

}