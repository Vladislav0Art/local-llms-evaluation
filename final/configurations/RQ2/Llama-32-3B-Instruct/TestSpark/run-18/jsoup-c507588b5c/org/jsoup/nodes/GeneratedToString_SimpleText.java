package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

public class GeneratedToString_SimpleText {

    @Test
    public void toString_SimpleText() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.toString());
    }

}