package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedNone_Safe {

    public void none() {
    }

    public void simpleText() {
    }

    public void basic() {
    }

    public void basicWithImages() {
    }

    public void relaxed() {
    }

    public Safelist() {
    }

    public Safelist(Safelist copy) {
    }

    public void addTags(String... tags) {
    }

    public void removeTags(String... tags) {
    }

    public void addAttributes(String tag, String... attributes) {
    }

    public void removeAttributes(String tag, String... attributes) {
    }

    public void addEnforcedAttribute(String tag, String attribute, String value) {
    }

    public void removeEnforcedAttribute(String tag, String attribute) {
    }

    public void preserveRelativeLinks(boolean preserve) {
    }

    public void addProtocols(String tag, String attribute, String... protocols) {
    }

    public void removeProtocols(String tag, String attribute, String... removeProtocols) {
    }
}

public class SafelistTest {

    @Test
    public void none_Safe() {
        Safelist safe = new Safelist();
        Assert.assertTrue(safe.isSafeTag("a"));
    }

}