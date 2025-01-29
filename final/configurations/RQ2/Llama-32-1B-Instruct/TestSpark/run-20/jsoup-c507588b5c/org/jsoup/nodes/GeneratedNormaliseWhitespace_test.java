package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedNormaliseWhitespace_test {

    @Test
    public void normaliseWhitespace_test() {
        assertTrue(TextNode.normaliseWhitespace("   Hello   World  "));
        assertTrue(TextNode.normaliseWhitespace("World"));
    }

}