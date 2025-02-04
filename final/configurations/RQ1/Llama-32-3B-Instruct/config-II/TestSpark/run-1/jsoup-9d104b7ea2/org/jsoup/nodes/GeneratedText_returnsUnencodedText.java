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
public class GeneratedText_returnsUnencodedText {

    @MockingBean
    private Document document;

    private TextNode textNode;

    private String encodedText = "&lt;";

    @BeforeAll
    public void setup() {
        textNode = new TextNode(encodedText);
    }

    @Test
    public void text_returnsUnencodedText() {
        // given:
        String expectedText = ">";
        String encodedText = "&lt;";

        // when:
        String actualText = textNode.text();

        // then:
        assertEquals(expectedText, actualText);
    }

}