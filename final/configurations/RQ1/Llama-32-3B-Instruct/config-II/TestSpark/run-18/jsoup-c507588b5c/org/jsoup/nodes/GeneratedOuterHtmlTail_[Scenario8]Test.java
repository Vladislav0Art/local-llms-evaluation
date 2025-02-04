package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTail_[Scenario8]

Test {

    @Mock
    private Node parentNode;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    public String getWholeText () {
        return "Hello World";
    }

    public String coreValue () {
        return "Hello World";
    }

    @Test
    public void outerHtmlTail_[ Scenario8]Test() throws IOException {
        Document.OutputSettings outSettings = Mockito.mock(Document.OutputSettings.class);

        TextNode node = new TextNode(getWholeText());
        node.outerHtmlTail(accum, 0, outSettings);
    }

}