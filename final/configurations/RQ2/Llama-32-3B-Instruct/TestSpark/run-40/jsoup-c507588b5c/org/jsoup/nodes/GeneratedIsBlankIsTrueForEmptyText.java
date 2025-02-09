package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIsBlankIsTrueForEmptyText {

    @Test
    public void isBlankIsTrueForEmptyText() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

}