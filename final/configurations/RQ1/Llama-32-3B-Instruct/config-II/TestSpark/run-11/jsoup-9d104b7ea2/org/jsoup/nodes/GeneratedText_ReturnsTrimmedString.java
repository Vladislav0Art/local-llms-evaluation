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
public class GeneratedText_ReturnsTrimmedString {

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
    public void text_ReturnsTrimmedString() {
        String trimmedText = stringUtil.stripLeadingWhitespace("   Hello World  ");
        assertNotNull(trimmedText);
        assertEquals(TRIMMED_TEXT_NODE_TEXT, trimmedText);
    }

}