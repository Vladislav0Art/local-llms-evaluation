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
public class GeneratedOuterHtmlHead_[Scenario7]

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
    public void outerHtmlHead_[ Scenario7]Test() throws IOException {
        when(out.prettyPrint()).thenReturn(true);
        Document.OutputSettings outSettings = new Document.OutputSettings();
        Document.OutputSettings expectedOutSettings = Mockito.mock(Document.OutputSettings.class);

        TextNode node = new TextNode(getWholeText());
        node.outerHtmlHead(accum, 0, outSettings);

        verify(out).prettyPrint();
        verify(outSettings).isBlock();
    }

}