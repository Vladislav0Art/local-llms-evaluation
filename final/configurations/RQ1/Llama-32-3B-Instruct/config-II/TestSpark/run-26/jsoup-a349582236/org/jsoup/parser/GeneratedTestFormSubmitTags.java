package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFormSubmitTags {

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
    public void testFormSubmitTags() {
        Tag buttonTag = new Tag("button");
        buttonTag.formSubmit = true;
        assertTrue(buttonTag.formSubmit);

        Tag inputTag = new Tag("input");
        inputTag.formSubmit = true;
        assertTrue(inputTag.formSubmit);
    }

}