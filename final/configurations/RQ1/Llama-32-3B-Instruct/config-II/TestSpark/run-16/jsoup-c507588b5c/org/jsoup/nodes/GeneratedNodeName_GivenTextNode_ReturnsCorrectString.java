package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNodeName_GivenTextNode_ReturnsCorrectString {

    @Test
    public void nodeName_GivenTextNode_ReturnsCorrectString() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("#text", textNode.nodeName());
    }

}