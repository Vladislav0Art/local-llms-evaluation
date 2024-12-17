package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOf_SelfClosingTag {

    @Test
    public void valueOf_SelfClosingTag() {
        Tag tag1 = new Tag();
        tag1.setName("img");
        Tag result = Tag.valueOf(tag1.getName(), null);
        assertTrue(result.isSelfClosing());
    }

}