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
public class GeneratedTest {

    @MockingBean
    private Document document;

    private TextNode textNode;

    private String encodedText = "&lt;";

    @BeforeAll
    public void setup() {
        textNode = new TextNode(encodedText);
    }

    @Test
    public void createTextNode_fromEncoded_textReturnsTextNode() {
        // given:
        TextNode createdTextNode = TextNode.createFromEncoded(encodedText);

        // then:
        assertNotNull(createdTextNode);
        assertEquals(encodedText, createdTextNode.value());
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

    @Test
    public void isBlank_returnsTrueIfOnlyWhitespace() {
        // given:
        String expectedText = ">";
        String encodedText = "&lt;";
        document = new Document();
        Mockito.when(document.root()).thenReturn(textNode);
        Mockito.when(document.root().parentNode()).thenReturn(new Element());

        // when:
        boolean actualBlank = textNode.isBlank();

        // then:
        assertTrue(actualBlank);
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