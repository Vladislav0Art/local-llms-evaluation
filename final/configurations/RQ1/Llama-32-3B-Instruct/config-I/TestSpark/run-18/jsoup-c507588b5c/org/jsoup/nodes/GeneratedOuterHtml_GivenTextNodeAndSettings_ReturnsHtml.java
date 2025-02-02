package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedOuterHtml_GivenTextNodeAndSettings_ReturnsHtml {

    @Mock
    private Node parentNode;

    @Test
    public void outerHtml_GivenTextNodeAndSettings_ReturnsHtml() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        TextNode textNode = new TextNode("Hello World");
        Document document = new Document();
        document.addNode(textNode);
        textNode.outerHtmlHead(accum, 0, out);
        Mockito.verify(accum).append(Mockito.anyString());
    }

}