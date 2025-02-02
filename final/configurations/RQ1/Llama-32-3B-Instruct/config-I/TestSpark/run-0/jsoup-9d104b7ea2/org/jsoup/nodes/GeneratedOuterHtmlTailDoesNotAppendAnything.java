package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlTailDoesNotAppendAnything {

    @Test
    public void outerHtmlTailDoesNotAppendAnything() {
        // given
        Appendable appendable = Mockito.mock(Appendable.class);
        TextNode textNode = new TextNode("test");

        // when
        textNode.outerHtmlTail(appendable, 0, new Document.OutputSettings());

        // then
        org.junit.Assert.assertTrue(appendable.toString().isEmpty());
    }

}