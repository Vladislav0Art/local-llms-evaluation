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
public class GeneratedOuterHtmlHead_WorksWhenDepthIsOne {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void outerHtmlHead_WorksWhenDepthIsOne() throws IOException {
        String originalText = "test";
        Document doc = Document.parse("original");
        Appendable accum = new Appendable();
        Document.OutputSettings out = new Document.OutputSettings();

        new TextNode(originalText).outerHtmlHead(accum, 1, out);

        assertTrue(StringUtil.containsHTML(accum.toString(), originalText));
    }

}