package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTestOuterHtmlTail {

    private TextNode textNode;

    @Before
    public void setUp() {
        textNode = new TextNode("");
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        textNode.text("test");
        Appendable accum = Mockito.mock(Appendable.class);
        textNode.outerHtmlTail(accum, 0, Document.OutputSettings.create());
        Mockito.verifyNoMoreInteractions(accum);
    }

}