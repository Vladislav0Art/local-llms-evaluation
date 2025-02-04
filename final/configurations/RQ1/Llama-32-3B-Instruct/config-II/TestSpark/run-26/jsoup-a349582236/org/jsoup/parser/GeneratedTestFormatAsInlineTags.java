package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFormatAsInlineTags {

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
    public void testFormatAsInlineTags() {
        Tag aTag = new Tag("a");
        aTag.formatAsBlock = false;
        assertFalse(aTag.formatAsBlock);

        Tag pTag = new Tag("p");
        pTag.formatAsBlock = false;
        assertFalse(pTag.formatAsBlock);
    }

}