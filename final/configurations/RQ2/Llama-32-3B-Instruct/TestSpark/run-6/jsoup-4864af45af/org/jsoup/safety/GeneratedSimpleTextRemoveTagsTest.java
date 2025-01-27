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

public class GeneratedSimpleTextRemoveTagsTest {

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
    public void simpleTextRemoveTagsTest() {
        TestSafelist safelist = new TestSafelist().simpleText().addTags("p", "span");
        safelist = safelist.removeTags("p");
        safeTags.add("p"); // for verification
        Mockito.verify(safeTags, Mockito.never()).add("p");
        safeTags.add("span");
    }

}