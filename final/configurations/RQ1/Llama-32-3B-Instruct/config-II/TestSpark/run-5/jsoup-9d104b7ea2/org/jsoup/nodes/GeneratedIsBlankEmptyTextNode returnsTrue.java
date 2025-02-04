package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsBlankEmptyTextNode returnsTrue {

    @Test
    public void isBlankEmptyTextNode

    returnsTrue() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}