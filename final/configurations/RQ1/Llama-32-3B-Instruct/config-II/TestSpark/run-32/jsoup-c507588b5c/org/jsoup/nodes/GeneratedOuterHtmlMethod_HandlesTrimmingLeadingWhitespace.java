package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.mockito.SpyBean;

@RunWith(JUnit4.class)
public class GeneratedOuterHtmlMethod_HandlesTrimmingLeadingWhitespace {

    @SpyBean
    private LeafNode parentNode;

    @Test
    public void outerHtmlMethod_HandlesTrimmingLeadingWhitespace() throws IOException {
        String text = "   Hello World";
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        int depth = 0;
        Document document = new Document();
        parentNode.addChildren(0, new Element(document));
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlHead(accum, depth, out);
        org.junit.Assert.assertEquals(accum.toString(), "<p>Hello World</p>");
    }

}