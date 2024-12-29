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
public class GeneratedOuterHtmlTail_SingleLineText {

    @Mock
    private Appendable accum;

    @Test
    public void outerHtmlTail_SingleLineText() {
        StringBuilder expected = new StringBuilder("");
        TextNode textNode = createText("Hello!");
        textNode.outerHtmlTail(accum, 1, Document.OutputSettings.build());
        assertEquals(expected.toString(), accum.toString());
    }

}