package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTestIsNotXmlDeclaration {

    public Comment(String data) {
        this.data = data;
    }

    private String data;

    @Test
    public void testIsNotXmlDeclaration() {
        assertFalse(new Comment(data).isXmlDeclaration());
    }

}