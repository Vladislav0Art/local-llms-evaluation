package org.jsoup.nodes;

import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSplitTextInvalidOffsetGreaterThanLength {

    @Test
    public void splitTextInvalidOffsetGreaterThanLength() {
        TextNode node = new TextNode("Node");
        node.splitText(5);
    }

}