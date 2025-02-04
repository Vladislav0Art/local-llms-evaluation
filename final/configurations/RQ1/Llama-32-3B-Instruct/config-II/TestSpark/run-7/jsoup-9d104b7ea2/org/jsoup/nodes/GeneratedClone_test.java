package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;

import java.io.IOException;

import static org.mockito.Mockito.when;

public class GeneratedClone_test {

    @Test
    public void clone_test() {
        TextNode originalText = new TextNode("Hello World");
        TextNode clonedText = (TextNode) originalText.clone();

        assertNotNull(clonedText);
        assertEquals(originalText.text().trim(), clonedText.text().trim());
    }

}