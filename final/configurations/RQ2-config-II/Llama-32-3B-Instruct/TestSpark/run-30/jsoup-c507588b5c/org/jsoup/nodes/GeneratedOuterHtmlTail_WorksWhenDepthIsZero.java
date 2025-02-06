package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTail_WorksWhenDepthIsZero {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void outerHtmlTail_WorksWhenDepthIsZero() {
        String originalText = "test";
        Document doc = Document.parse("original");
        Appendable accum = new Appendable();
        Document.OutputSettings out = new Document.OutputSettings();

        new TextNode(originalText).outerHtmlTail(accum, 0, out);
    }

}