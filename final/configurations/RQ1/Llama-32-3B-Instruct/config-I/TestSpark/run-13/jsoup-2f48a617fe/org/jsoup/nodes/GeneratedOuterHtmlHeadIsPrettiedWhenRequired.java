package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedOuterHtmlHeadIsPrettiedWhenRequired {

    @Test
    public void outerHtmlHeadIsPrettiedWhenRequired() throws IOException {
        Document outputSettings = new Document.OutputSettings(true, true);
        Comment comment = new Comment("Hello, World!");
        StringBuilder accum = new StringBuilder();
        Appendable appendable = accum;
        Document document = null;
        int depth = 0;
        comment.outerHtmlHead(appendable, depth, outputSettings);
        String expected = "<div><p><!--Hello, World!--></p></div>";
        assertEquals(expected, accum.toString());
    }

}