package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedOuterHtml_Tail_GivenTextNodeAndSettings_ReturnsEmpty {

    @Mock
    private Node parentNode;

    @Test
    public void outerHtml_Tail_GivenTextNodeAndSettings_ReturnsEmpty() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        TextNode textNode = new TextNode("Hello World");
        document.addNode(textNode);
        Mockito.verify(accum).append(Mockito.anyString());
    }

}