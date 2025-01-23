package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHead_AppendsHtml {

    @Test
    public void outerHtmlHead_AppendsHtml() throws IOException {
        Appendable appendable = mock(Appendable.class);
        TextNode textNode = new TextNode("test");
        textNode.outerHtmlHead(appendable, 0, mock(Document.OutputSettings.class));
        assertEquals("<text>test</text>", appendable.toString());
    }

}