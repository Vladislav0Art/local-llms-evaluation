package org.jsoup.nodes;

import org.jsoup.helper.Validate;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNormaliseWhitespace_HyphenatedText_ReturnsHyphennatedText {

    @Test
    public void normaliseWhitespace_HyphenatedText_ReturnsHyphennatedText() {
        String text = "This-is-a-hyphennated-text";
        assertEquals(text, StringUtil.normaliseWhitespace(text));
    }
}

class Document {
    static class OutputSettings {
    }

}