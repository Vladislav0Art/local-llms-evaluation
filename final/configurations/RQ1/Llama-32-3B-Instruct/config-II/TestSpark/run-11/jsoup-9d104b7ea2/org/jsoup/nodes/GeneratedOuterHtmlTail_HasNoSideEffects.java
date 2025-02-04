package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
public class GeneratedOuterHtmlTail_HasNoSideEffects {

"classpath*:test.xml"
})

public class TextNodeTest {

    @Mock
    private Document document;

    @Mock
    private Element parent;

    @Autowired
    private StringUtil stringUtil;

    public static final String TEXT_NODE_TEXT = "Hello World";
    public static final String TRIMMED_TEXT_NODE_TEXT = "Hello World";

    @Test
    public void outerHtmlTail_HasNoSideEffects() throws Exception {
        Appendable appendable = new StringBuilder();
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        TextNode textNode = new TextNode("");
        textNode.outerHtmlHead(appendable, 0, outputSettings);
        assertTrue(applicable.toString().isEmpty());
    }

}