package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedToString_GivenTextNode_ReturnsCorrectString {

    @Test
    public void toString_GivenTextNode_ReturnsCorrectString() throws IOException {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("<p>Hello World</p>", textNode.toString());
    }

}