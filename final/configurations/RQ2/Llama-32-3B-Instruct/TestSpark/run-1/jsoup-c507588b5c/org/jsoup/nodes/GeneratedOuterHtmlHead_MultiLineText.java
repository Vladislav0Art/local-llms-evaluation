package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.Validate.isNotBlank;
import static org.jsoup.helper.Validate.notBlank;
import static org.jsoup.helper.Validate.nullsAreEqual;
import static org.jsoup.nodes.TextNode.createFromEncoded;
import static org.jsoup.nodes.TextNode.createText;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHead_MultiLineText {

    @Mock
    private Appendable accum;

    @Test
    public void outerHtmlHead_MultiLineText() throws IOException {
        StringBuilder expected = new StringBuilder("<p>Hello,<br>World!</p>");
        TextNode textNode = createText("Hello,\n World!");
        textNode.outerHtmlHead(accum, 1, Document.OutputSettings.build());
        assertEquals(expected.toString(), accum.toString());
    }

}