package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedIsBlank_nonEmptyTextNode_ReturnsFalse {

    @Test
    public void isBlank_nonEmptyTextNode_ReturnsFalse() {
        TextNode textNode = new TextNode("Hello");
        assertFalse(textNode.isBlank());
    }

}