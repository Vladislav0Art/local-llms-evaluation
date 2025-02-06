package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedOuterHtmlTailDoesNotAppendAnything {

    @Test
    public void outerHtmlTailDoesNotAppendAnything() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        TextNode textNode = new TextNode("");
        textNode.outerHtmlTail(accum, 0, out);
        verify(accum).append(equals(0));
    }

}