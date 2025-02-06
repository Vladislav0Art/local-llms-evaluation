package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPreserveWhitespace_EmptyTag_ReturnsTrue {

    @Test
    public void preserveWhitespace_EmptyTag_ReturnsTrue() {
        boolean preserveWhitespace = Tag preservesWhitespace();
        assertTrue(preserveWhitespace);
    }
}

}