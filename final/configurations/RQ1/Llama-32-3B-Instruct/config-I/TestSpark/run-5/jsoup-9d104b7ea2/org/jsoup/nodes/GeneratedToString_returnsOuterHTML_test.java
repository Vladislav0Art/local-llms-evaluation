package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(JUnit4.class)
public class GeneratedToString_returnsOuterHTML_test {

    @Mock
    private LeafNode parentNode;

    @Test
    public void toString_returnsOuterHTML_test() throws IOException {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        String result = textNode.toString();
        assertEquals("<p>Hello, World!</p>", result);
    }

}