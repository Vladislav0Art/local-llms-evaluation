package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedTest {

    private String tagName;
    public boolean isBlock = false;
    public boolean formatAsBlock = false;
    public boolean empty = false;
    public boolean preserveWhitespace = false;
    public boolean formList = false;
    public boolean formSubmit = false;

    public static Map<String, Tag> tags = new HashMap<>();

    public static void registerTag(Tag tag) {
        tags.put(tag.tagName, tag);
    }

    public Tag(String tagName) {
        this.tagName = tagName;
    }
}

public class TestTag {

}