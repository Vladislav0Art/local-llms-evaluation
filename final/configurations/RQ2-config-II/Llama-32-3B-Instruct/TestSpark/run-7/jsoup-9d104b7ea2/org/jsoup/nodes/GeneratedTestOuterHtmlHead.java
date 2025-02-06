package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestOuterHtmlHead {

    @Mock
    private String text;

    @Mock
    private StringBuilder sb;

    public void setText(String text) {
        this.text = text;
    }

    public void set

    Sb(StringBuilder sb) {
        this.sb = sb;
    }

    @Test
    public void testOuterHtmlHead() {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.getOutputMode()).thenReturn(Document.OutputMode.XHTML);
        TextNode node = new TextNode("Hello World");
        TextNode result = new TextNode("<p>Hello World</p>");
        assertEquals(result, node.outerHtmlHead(accum, 0, out));
    }

}