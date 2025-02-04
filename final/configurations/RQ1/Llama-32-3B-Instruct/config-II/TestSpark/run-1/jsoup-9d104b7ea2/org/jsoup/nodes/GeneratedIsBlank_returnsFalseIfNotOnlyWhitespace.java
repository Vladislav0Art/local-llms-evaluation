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
public class GeneratedIsBlank_returnsFalseIfNotOnlyWhitespace {

    @MockingBean
    private Document document;

    private TextNode textNode;

    private String encodedText = "&lt;";

    @BeforeAll
    public void setup() {
        textNode = new TextNode(encodedText);
    }

    @Test
    public void isBlank_returnsFalseIfNotOnlyWhitespace() {
        // given:
        String expectedText = ">";
        String encodedText = "&lt;";

        // when:
        boolean actualBlank = textNode.isBlank();

        // then:
        assertFalse(actualBlank);
    }

}