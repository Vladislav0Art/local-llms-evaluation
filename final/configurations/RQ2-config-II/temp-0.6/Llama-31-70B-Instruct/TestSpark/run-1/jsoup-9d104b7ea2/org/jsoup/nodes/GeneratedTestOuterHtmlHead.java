package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws Exception {
        TextNode textNode = Mockito.mock(TextNode.class);
        Appendable appendable = Mockito.mock(Appendable.class);
        Document.OutputSettings outputSettings = Mockito.mock(Document.OutputSettings.class);

        when(outputSettings.prettyPrint()).thenReturn(true);

        textNode.outerHtmlHead(appendable, 0, outputSettings);

        Mockito.verify(outputSettings).prettyPrint();
    }

}