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
public class GeneratedOuterHtmlTail_GivenTextNodeAndSettings_ReturnsEmptyString {

    @Mock
    private String text;

    @Mock
    private Appendable accum;

    @Test
    public void outerHtmlTail_GivenTextNodeAndSettings_ReturnsEmptyString() {
        String expected = "";
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.getOutputMode()).thenReturn(Document.OutputMode.HTML);
        TextNode textNode = new TextNode("");
        textNode.outerHtmlTail(mock(Appendable.class), 0, out);
    }

}