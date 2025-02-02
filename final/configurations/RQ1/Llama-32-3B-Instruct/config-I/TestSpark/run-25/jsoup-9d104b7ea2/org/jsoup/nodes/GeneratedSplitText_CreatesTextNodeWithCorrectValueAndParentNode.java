package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.mockito.Mockito;

public class GeneratedSplitText_CreatesTextNodeWithCorrectValueAndParentNode {

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
    public void splitText_CreatesTextNodeWithCorrectValueAndParentNode() throws IOException {
        TextNode tailNode = textNode.splitText(5);
        assertNotNull(tailNode.parentNode());
        assertEquals(6, tailNode.text().length());
    }
}

public class TextNodeMethodUnderTestTest extends TextNodeTest {

    public TextNodeMethodUnderTestTest(String method) {
        super(method);
    }

    @Override
    public String methodName() {
        return "createTextNode" + super.methodName();
    }

}