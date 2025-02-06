package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPreserveWhitespace_SelfClosingTag_ReturnsTrue {

    @Test
    public void preserveWhitespace_SelfClosingTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setSelfClosing(true);
        Validate.isTrue(tag.preserveWhitespace());
    }

}