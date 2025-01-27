package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTest {

    public static Set<String> safeTags = new java.util.HashSet<>();

    public static Set<String> safeAttributes = new java.util.HashSet<>();

    public static class TestSafelist extends Safelist {
        @Override
        public <T> T basicAttributes() {
            return (T) super.basicAttributes();
        }

        @Override
        public void addAttribute(String tagName, String attribute, Attributes attributes) {
            super.addAttribute(tagName, attribute, attributes);
        }
    }

    @Test
    public void noneSafeTagTest() {
        TestSafelist safelist = new TestSafelist().none();
        org.junit.Assert.assertTrue(safelist.isSafeTag("script"));
    }

    @Test
    public void noneNoSafeTagTest() {
        TestSafelist safelist = new TestSafelist().none();
        org.junit.Assert.assertFalse(safelist.isSafeTag("test"));
    }

    @Test
    public void simpleTextAddTagsTest() {
        TestSafelist safelist = new TestSafelist().simpleText().addTags("p", "span");
        safeTags.add("p");
        safeTags.add("span");
        Mockito.verify(safeTags).add("p");
        Mockito.verify(safeTags).add("span");
    }

    @Test
    public void simpleTextRemoveTagsTest() {
        TestSafelist safelist = new TestSafelist().simpleText().addTags("p", "span");
        safelist = safelist.removeTags("p");
        safeTags.add("p"); // for verification
        Mockito.verify(safeTags, Mockito.never()).add("p");
        safeTags.add("span");
    }

    @Test
    public void basicAddAttributesTest() {
        TestSafelist safelist = new TestSafelist().basicAttributes();
        Attributes attributes = new org.jsoup.nodes.Attributes();
        safelist.addAttribute("img", "src", attributes);
        org.junit.Assert.assertTrue(attributes.contains("src"));
    }

    @Test
    public void basicAddAttributesTest2() {
        TestSafelist safelist = new TestSafelist().basicAttributes();
        Attributes attributes = new org.jsoup.nodes.Attributes();
        safelist.addAttribute("a", "href", attributes);
        org.junit.Assert.assertTrue(attributes.contains("href"));
    }

}