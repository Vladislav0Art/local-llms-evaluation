package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Generated[TextNodeUnescape]

Test {

    public TextNode testNode (String text){
        return new TextNode(text);
    }

    @Test
    public void [TextNodeUnescape]Test() {
        String encodedText = "&lt;";
        String expected = "<";
        assertEquals(expected, TextNode.createFromEncoded(encodedText).text());
    }
}

class MockableTextNode extends TextNode {
    private boolean coreValueCalled;
    private String coreValue;

    public MockableTextNode(String text) {
        super(text);
        coreValueCalled = false;
    }

    @Override
    protected void coreValue(String text) {
        super.coreValue(text);
        coreValueCalled = true;
        this.coreValue = text;
    }
}

}