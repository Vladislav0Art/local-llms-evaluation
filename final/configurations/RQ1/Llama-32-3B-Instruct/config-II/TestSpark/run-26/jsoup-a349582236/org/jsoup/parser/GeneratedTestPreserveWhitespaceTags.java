package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestPreserveWhitespaceTags {

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
    public void testPreserveWhitespaceTags() {
        Tag preTag = new Tag("pre");
        preTag.preserveWhitespace = true;
        assertTrue(preTag.preserveWhitespace);

        Tag plaintextTag = new Tag("plaintext");
        plaintextTag.preserveWhitespace = true;
        assertTrue(plaintextTag.preserveWhitespace);
    }

}