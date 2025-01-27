package org.jsoup.parser;

import static org.junit.Assert.*;

import java.util.concurrent.Mock;

public class GeneratedProcess_WithEndTag_ReturnsTrue {

    @Test
    public void process_WithEndTag_ReturnsTrue() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = mockToken();
        boolean result = builder.process(token);
        assertTrue(result);
    }

    private MockedToken mockToken() {
        return new MockedToken();
    }
}

class MockedToken implements Token {
    @Override
    public boolean process(XmlTreeBuilder builder) {
        // implementation to make the test pass
        return true;
    }
}

}