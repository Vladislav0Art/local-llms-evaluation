package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestEmptyTags {

    public String tagName;
    public boolean empty;
    public boolean formatAsBlock;
    public boolean preserveWhitespace;
    public boolean formList;
    public boolean formSubmit;

    public Tag(String tagName) {
        this.tagName = tagName;
    }
}

import org.junit.Test;
import static org.junit.Assert .*;

public class TagTest {

    @Test
    public void testEmptyTags() {
        Tag metaTag = new Tag("meta");
        metaTag.empty = true;
        assertTrue(metaTag.empty);

        Tag linkTag = new Tag("link");
        linkTag.empty = true;
        assertTrue(linkTag.empty);

        Tag imgTag = new Tag("img");
        imgTag.empty = true;
        assertTrue(imgTag.empty);
    }

}