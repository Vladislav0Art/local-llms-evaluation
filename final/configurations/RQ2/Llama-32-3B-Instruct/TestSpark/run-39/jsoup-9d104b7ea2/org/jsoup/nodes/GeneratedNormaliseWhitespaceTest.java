package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = "\n  Hello\nWorld";
        assertEquals("Hello\nWorld", StringUtil.normaliseWhitespace(text));
    }

}