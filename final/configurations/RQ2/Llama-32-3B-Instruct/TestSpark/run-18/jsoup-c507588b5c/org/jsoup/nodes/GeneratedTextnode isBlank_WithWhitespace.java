package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class GeneratedTextnode isBlank_WithWhitespace {

    @Test
    public void textnode

    isBlank_WithWhitespace() {
        TextNode textNode = new TextNode(" ");
        assertFalse(textNode.isBlank());
    }

}