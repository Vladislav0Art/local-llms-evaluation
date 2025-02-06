package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing_NonSelfClosingTag_ReturnsFalse {

    @Test
    public void isSelfClosing_NonSelfClosingTag_ReturnsFalse() {
        Tag tag = new Tag();
        Validate.assertFalse(tag.isSelfClosing());
    }

}