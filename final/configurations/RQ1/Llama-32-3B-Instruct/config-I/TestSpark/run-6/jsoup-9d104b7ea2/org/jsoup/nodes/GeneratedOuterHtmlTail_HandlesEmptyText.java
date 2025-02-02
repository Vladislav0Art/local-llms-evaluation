package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedOuterHtmlTail_HandlesEmptyText {

    @Test
    public void outerHtmlTail_HandlesEmptyText() {
        String text = "";
        when(StringUtil.normaliseWhitespace(text)).thenReturn("");
        TextNode textNode = new TextNode(text);
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        document.output(out, accum);
        assertThat(accum.toString(), is(""));
    }

}