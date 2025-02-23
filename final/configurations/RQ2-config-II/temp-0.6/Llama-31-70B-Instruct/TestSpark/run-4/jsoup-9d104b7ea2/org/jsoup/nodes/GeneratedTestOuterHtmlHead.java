package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTestOuterHtmlHead {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("");
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        textNode.text("test");
        Appendable accum = Mockito.mock(Appendable.class);
        textNode.outerHtmlHead(accum, 0, Document.OutputSettings.create());
        Mockito.verify(accum).append("test");
    }

}