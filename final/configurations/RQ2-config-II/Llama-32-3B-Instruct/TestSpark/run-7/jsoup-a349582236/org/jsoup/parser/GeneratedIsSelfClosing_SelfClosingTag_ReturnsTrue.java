package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing_SelfClosingTag_ReturnsTrue {

    @Test
    public void isSelfClosing_SelfClosingTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setSelfClosing(true);
        Validate.isTrue(tag.isSelfClosing());
    }

}