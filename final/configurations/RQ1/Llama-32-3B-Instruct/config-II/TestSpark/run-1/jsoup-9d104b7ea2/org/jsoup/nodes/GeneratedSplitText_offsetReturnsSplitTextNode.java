package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;
import org.junit.runner.RunWith;
import org.mockito.MockingBean;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitText_offsetReturnsSplitTextNode {

    @MockingBean
    private Document document;

    private TextNode textNode;

    private String encodedText = "&lt;";

    @BeforeAll
    public void setup() {
        textNode = new TextNode(encodedText);
    }

    @Test
    public void splitText_offsetReturnsSplitTextNode() {
        // given:
        int offset = 3;
        String expectedTail = ">";
        String encodedText = "&lt;";

        // when:
        TextNode tailNode = textNode.splitText(offset);

        // then:
        assertEquals(expectedTail, tailNode.value());
    }

}