package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestToString {

    private static Map<String, Tag> tags = new HashMap<>();

    public static void register(Tag tag) {
        if (!tags.containsKey(tag.tagName)) {
            tags.put(tag.tagName, tag);
        }
    }

    public static String toString() {
        return Jsoup.parse("<!DOCTYPE html><html><body>" + tags.values().stream().map(e -> e.toString()).reduce((a, b) -> a + "\n" + b).orElse("").trim() + "</body></html>").text();
    }

    @Test
    public void testToString() {
        // Test toString method
        register(new Tag("div"));
        register(new Tag("span"));
        tags.put("div", new Tag("div"));
        tags.put("span", new Tag("span"));
        Element element = new Element(tags);
        System.out.println(element.toString());
    }
}

class Tag {
    private String tagName;

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tag tag = (Tag) obj;
        return tagName.equals(tag.tagName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagName);
    }
}

class Element {
    private Map<String, Tag> tags;

    public Element(Map<String, Tag> tags) {
        this.tags = tags;
    }

    public String toString() {
        return Jsoup.parse("<!DOCTYPE html><html><body>" + tags.values().stream().map(e -> e.toString()).reduce((a, b) -> a + "\n" + b).orElse("").trim() + "</body></html>").text();
    }

}