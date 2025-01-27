package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class GeneratedTextnode clone_ReturnsSameType {

    @Test
    public void textnode

    clone_ReturnsSameType() {
        TextNode textNode1 = new TextNode("test");
        TextNode textNode2 = textNode1.clone();
        assertTrue(textNode2 instanceof TextNode);
    }

}