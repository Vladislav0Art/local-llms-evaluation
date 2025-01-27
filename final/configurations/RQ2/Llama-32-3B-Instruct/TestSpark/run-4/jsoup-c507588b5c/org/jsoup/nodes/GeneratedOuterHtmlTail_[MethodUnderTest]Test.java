package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTail_[MethodUnderTest]

Test {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private LeafNode parent;

    public TextNode testTextNode () {
        return new TextNode("Hello World");
    }

    @Test
    public void outerHtmlTail_[ MethodUnderTest]Test() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        testTextNode().outerHtmlHead(output, 1, out).outerHtmlTail(output, 2, out);
        when(accum.append(anyString())).thenAnswer(i -> i);
        assertEquals("</body></html>", String.format("%s", testTextNode()));
    }

}