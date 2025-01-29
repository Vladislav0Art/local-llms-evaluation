package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedStripLeadingWhitespace_test {

    @Test
    public void stripLeadingWhitespace_test() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World");
        assertEquals(6, sb.toString().length());
        sb.setLength(0);
        assertEquals(5, sb.toString().length());
    }

}