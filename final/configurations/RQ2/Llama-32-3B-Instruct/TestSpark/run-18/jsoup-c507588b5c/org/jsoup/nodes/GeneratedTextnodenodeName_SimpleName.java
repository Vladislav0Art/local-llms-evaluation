package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class GeneratedTextnodenodeName_SimpleName {

    @Test
    public void textnodenodeName_SimpleName() {
        TextNode textNode = new TextNode();
        assertEquals("", getTagName(textNode));
    }

    public boolean isSameType(TextNode one, TextNode two) {
        return one instanceof TextNode && two instanceof TextNode;
    }

}