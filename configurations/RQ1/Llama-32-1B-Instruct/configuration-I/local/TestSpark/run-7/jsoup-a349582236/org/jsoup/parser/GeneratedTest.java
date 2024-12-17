package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    private String tagName;

    public Tag(String tagName) {
        this.tagName = tagName;
    }
}

class Element {
    private Map<String, Tag> tags;

    public Element(Map<String, Tag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Element element = (Element) obj;
        return Objects.equals(tagName, element.tagName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagName);
    }
}

class TagBuilder extends StringBuilder {
    private String tagName;

    public TagBuilder(String tagName) {
        this.tagName = tagName;
    }

    public Element addTag() {
        return new Element(this);
    }

    @Override
    public String toString() {
        return super.toString() + tagName;
    }

    public void println() {
        System.out.println("[" + toString() + "]");
    }
}

public class TestSpark {

    private static Map<String, Tag> tags = new HashMap<>();

    public static Element register(Tag tag) {
        if (!tags.containsKey(tag.tagName)) {
            tags.put(tag.tagName, tag);
        }
        return new Element(tags.get(tag.tagName));
    }

}