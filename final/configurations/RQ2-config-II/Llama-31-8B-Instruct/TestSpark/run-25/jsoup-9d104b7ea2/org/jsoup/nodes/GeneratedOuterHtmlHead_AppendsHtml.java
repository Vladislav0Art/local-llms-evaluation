package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHead_AppendsHtml {

    @Test
    public void outerHtmlHead_AppendsHtml() throws IOException {
        TextNode textNode = new TextNode("text");
        StringWriter writer = new StringWriter();
        textNode.outerHtmlHead(writer, 0, null);
        assertEquals("<text>text</text>", writer.toString());
    }

}