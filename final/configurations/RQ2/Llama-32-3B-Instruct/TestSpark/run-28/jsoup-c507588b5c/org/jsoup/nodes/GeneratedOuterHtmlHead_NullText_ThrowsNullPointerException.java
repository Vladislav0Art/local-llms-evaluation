package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedOuterHtmlHead_NullText_ThrowsNullPointerException {

    @Test
    public void outerHtmlHead_NullText_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new TextNode(null).outerHtmlHead(new StringBuilder(), 0, new Document.OutputSettings()));
    }

}