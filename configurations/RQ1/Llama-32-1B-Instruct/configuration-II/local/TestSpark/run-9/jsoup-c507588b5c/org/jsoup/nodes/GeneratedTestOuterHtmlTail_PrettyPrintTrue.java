package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.jsoup.nodes.Document;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestOuterHtmlTail_PrettyPrintTrue {

    @Mock
    private Document document;

    @InjectMocks
    private TextNode textNode;

    @BeforeClass
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        document = new Document();
    }

    @Test
    public void testOuterHtmlTail_PrettyPrintTrue() {
        document.clear();
        document.append("H1  <p>Some content</p></body><body></body><body>Some more content</body>");
        textNode.outerHtmlTail(document.getAppendable(), -1, null);
        assertTrue(document.hasBody());
    }

}