package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedOuterHtmlTail_NullText_ThrowsNullPointerException {

    @Test
    public void outerHtmlTail_NullText_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new TextNode(null).outerHtmlTail(new StringBuilder(), 0, new Document.OutputSettings()));
    }

}