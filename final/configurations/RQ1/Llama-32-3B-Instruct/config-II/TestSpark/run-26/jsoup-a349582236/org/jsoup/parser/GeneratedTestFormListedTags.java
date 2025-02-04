package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFormListedTags {

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
    public void testFormListedTags() {
        Tag buttonTag = new Tag("button");
        buttonTag.formList = true;
        assertTrue(buttonTag.formList);

        Tag inputTag = new Tag("input");
        inputTag.formList = true;
        assertTrue(inputTag.formList);
    }

}