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
public class GeneratedSplitText_ReturnsCorrectTextNode {

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
    public void splitText_ReturnsCorrectTextNode() throws Exception {
        TextNode textNode = new TextNode(TEXT_NODE_TEXT);
        int offset = 7;
        String substring = "Hello";
        TextNode result = (TextNode) textNode.splitText(offset);
        assertEquals(substring, result.text());
    }

}