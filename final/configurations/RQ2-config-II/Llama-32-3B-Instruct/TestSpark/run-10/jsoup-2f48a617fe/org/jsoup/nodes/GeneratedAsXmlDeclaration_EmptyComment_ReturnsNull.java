package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedAsXmlDeclaration_EmptyComment_ReturnsNull {

    @Test
    public void asXmlDeclaration_EmptyComment_ReturnsNull() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

}