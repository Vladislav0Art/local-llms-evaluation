package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreateTextNodeIsEmptyText {

    @Test
    public void createTextNodeIsEmptyText() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertNull(textNode.text());
    }

}