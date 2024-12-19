package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeName_GivenTextNode_ReturnsCorrectValue {

    @Test
    public void nodeName_GivenTextNode_ReturnsCorrectValue() {
        TextNode textNode = new TextNode("");
        assertEquals("#text", textNode.nodeName());
    }

}