package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        TextNode textNode = new TextNode(" Test ");
        Appendable appendableMock = mock(Appendable.class);
        Document.OutputSettings outputSettingsMock = mock(Document.OutputSettings.class);
        when(outputSettingsMock.prettyPrint()).thenReturn(true);
        textNode.outerHtmlHead(appendableMock, 0, outputSettingsMock);
    }

}