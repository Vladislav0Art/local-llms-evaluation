package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Tag;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedShouldBeSelfClosingTag {

    @Test
    public void shouldBeSelfClosingTag() {
        Tag tag = new Tag("br");
        assertTrue(tag.isSelfClosing());
    }

}