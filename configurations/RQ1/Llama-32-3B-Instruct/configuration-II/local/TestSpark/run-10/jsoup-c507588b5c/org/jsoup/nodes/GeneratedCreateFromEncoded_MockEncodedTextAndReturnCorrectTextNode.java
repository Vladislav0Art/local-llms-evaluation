package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class GeneratedCreateFromEncoded_MockEncodedTextAndReturnCorrectTextNode {

    @Mock
    private LeafNode parent;
    @Mock
    private Appendable accum;
    @Mock
    private Document.OutputSettings out;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() {
        // Empty
    }

    @Test
    public void createFromEncoded_MockEncodedTextAndReturnCorrectTextNode() {
        String encodedText = "&lt;Hello&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode.parent);
        assertEquals("Hello", textNode.value);
    }
}

public class LeafNode {
    // Empty
}

public class Document {
    public static class OutputSettings {
        // Empty
    }

    public static class Appendable {
        private StringBuilder value;

        public void append(StringBuilder sb) {
            this.value = sb;
        }

        public String toString() {
            return value.toString();
        }
    }

}