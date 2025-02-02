package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.mockito.Mockito;

public class GeneratedCreateTextNode_fromEncoded_StringEncodesCorrectly {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("");
    }

    public TextNodeMethodUnderTestTest(String method) {
        this.method = method;
    }

    public String methodName() {
        return "[MethodUnderTest]" + method + "Test";
    }

    @Test
    public void createTextNode_fromEncoded_StringEncodesCorrectly() throws IOException {
        String encodedText = "&lt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("<", textNode.text());
    }
}

public class TextNodeStaticMethodUnderTestTest extends TextNodeTest {

    public TextNodeStaticMethodUnderTestTest(String method) {
        super(method);
    }

    @Override
    public String methodName() {
        return "normaliseWhitespace" + super.methodName();
    }

}