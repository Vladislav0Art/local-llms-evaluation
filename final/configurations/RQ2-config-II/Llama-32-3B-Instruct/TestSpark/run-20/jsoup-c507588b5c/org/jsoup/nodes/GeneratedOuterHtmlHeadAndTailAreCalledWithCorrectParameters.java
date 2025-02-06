package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedOuterHtmlHeadAndTailAreCalledWithCorrectParameters {

    @Test
    public void outerHtmlHeadAndTailAreCalledWithCorrectParameters() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        TextNode textNode = new TextNode("text");
        textNode.outerHtmlHead(accum, 0, out);
        verify(accum).append("text");
    }

}