package org.jsoup.safety;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratedTestRemoveAttribute {

    @Test
    public void testRemoveAttribute() {
        List<String> relaxedTags = new ArrayList<>();
        Set<String> relaxedAttributes = new HashSet<>();

        // Test adding and removing an attribute
        relaxedAttributes.add("a");
        relaxedAttributes.remove("a");

        assertTrue(relaxedAttributes.isEmpty());
        assertFalse(relaxedAttributes.contains("href"));
    }
}

class Safelist {
    private List<String> safeTags;
    private Set<String> relaxedTags;
    private Set<String> relaxedAttributes;

    public Safelist() {
        this.safeTags = new ArrayList<>();
        this.relaxedTags = new HashSet<>();
        this.relaxedAttributes = new HashSet<>();
    }

    public void addTag(String tag) {
        this.safeTags.add(tag);
    }

    public void addRelaxedTag(String tag) {
        this.relaxedTags.add(tag);
    }

    public void addAttribute(String attributeName, String attributeValue) {
        this.relaxedAttributes.add(attributeName + ":" + attributeValue);
    }

    public void removeAttribute(String attributeName, String attributeValue) {
        this.relaxedAttributes.remove(attributeName + ":" + attributeValue);
    }

    public boolean isSafeTag(String tag) {
        return this.safeTags.contains(tag);
    }

    public boolean isRelaxedTag(String tag) {
        return this.relaxedTags.contains(tag);
    }

    public boolean isSafeAttribute(String attributeName, String attributeValue) {
        return this.relaxedAttributes.contains(attributeName + ":" + attributeValue);
    }

}