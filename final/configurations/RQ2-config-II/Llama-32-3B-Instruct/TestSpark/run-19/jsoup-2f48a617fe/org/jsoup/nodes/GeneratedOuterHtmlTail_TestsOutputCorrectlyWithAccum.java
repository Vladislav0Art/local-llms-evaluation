package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedOuterHtmlTail_TestsOutputCorrectlyWithAccum {

    @Mock
    private Appendable accum;

    @Mock
    private Element parent;

    @Test
    public void outerHtmlTail_TestsOutputCorrectlyWithAccum() {
        Document document = new Document();
        Comment comment = new Comment("<p>Hello World!</p>");
        comment.outerHtmlTail(accum, 0, document.OutputSettings.getDefaultSettings());
        assertEquals("", accum.toString());
    }

}