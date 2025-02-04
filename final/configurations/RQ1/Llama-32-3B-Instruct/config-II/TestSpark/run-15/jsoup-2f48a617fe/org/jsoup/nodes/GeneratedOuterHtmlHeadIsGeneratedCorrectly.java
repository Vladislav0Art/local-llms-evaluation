package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadIsGeneratedCorrectly {

    @Test
    public void outerHtmlHeadIsGeneratedCorrectly() throws IOException {
        Comment comment = new Comment("data");
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        int depth = 0;
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!--data-->_", accum.toString());
    }

}