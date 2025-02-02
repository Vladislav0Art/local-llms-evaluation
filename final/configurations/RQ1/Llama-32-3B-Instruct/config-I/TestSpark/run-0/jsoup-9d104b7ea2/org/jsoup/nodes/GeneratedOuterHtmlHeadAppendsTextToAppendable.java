package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedOuterHtmlHeadAppendsTextToAppendable {

    @Test
    public void outerHtmlHeadAppendsTextToAppendable() {
        // given
        Appendable appendable = Mockito.mock(Appendable.class);
        TextNode textNode = new TextNode("test");

        // when
        textNode.outerHtmlHead(appendable, 0, new Document.OutputSettings());

        // then
        org.junit.Assert.assertNotNull(appendable.toString());
    }

}