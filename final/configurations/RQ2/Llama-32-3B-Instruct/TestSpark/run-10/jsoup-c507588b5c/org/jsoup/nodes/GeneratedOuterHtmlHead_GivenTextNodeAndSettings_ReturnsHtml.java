package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHead_GivenTextNodeAndSettings_ReturnsHtml {

    @Mock
    private String text;

    @Mock
    private Appendable accum;

    @Test
    public void outerHtmlHead_GivenTextNodeAndSettings_ReturnsHtml() throws Exception {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = new Document.OutputSettings();
        when(out.getOutputMode()).thenReturn(Document.OutputMode.HTML);
        TextNode textNode = new TextNode("Hello World!");
        textNode.outerHtmlHead(accum, 0, out);
    }

}