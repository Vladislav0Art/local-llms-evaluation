package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        TextNode textNode = new TextNode("");
        Appendable accumulator = Mockito.mock(Appendable.class);
        try {
            textNode.outerHtmlHead(accumulator, 1, Mockito.mock(Document.OutputSettings.class));
            Mockito.verify(accumulator).append("");
        } catch (IOException e) {
            // handle the exception
        }
    }

}