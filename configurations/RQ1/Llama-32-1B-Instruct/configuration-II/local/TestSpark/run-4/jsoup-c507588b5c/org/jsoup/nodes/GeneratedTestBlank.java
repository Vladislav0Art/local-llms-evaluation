package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestBlank {

    @Test
    public void testBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}