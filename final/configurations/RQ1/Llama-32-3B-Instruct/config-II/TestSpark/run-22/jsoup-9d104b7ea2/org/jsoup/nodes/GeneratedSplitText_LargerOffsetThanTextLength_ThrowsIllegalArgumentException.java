package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_LargerOffsetThanTextLength_ThrowsIllegalArgumentException {

    @Test
    public void splitText_LargerOffsetThanTextLength_ThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new TextNode("Hello World").splitText(10));
    }
}

public class MockitoTextNodeTest {

    @Mock
    private Appendable accum;

    @InjectMocks
    private TextNode textNode;

    @Before
    public void setup() throws IOException {
        MockitoAnnotations.initFields(this);
        textNode = new TextNode("Hello World");
    }

}