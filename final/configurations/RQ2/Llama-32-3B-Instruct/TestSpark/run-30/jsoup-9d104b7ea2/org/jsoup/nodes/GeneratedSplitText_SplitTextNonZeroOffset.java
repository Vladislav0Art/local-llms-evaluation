package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert_NULL;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.Validate.isValid;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitText_SplitTextNonZeroOffset {

    @Test
    public void splitText_SplitTextNonZeroOffset() {
        TextNode node = new TextNode("Hello World");
        TextNode leftChild = node.splitText(5);
        assertNotNull(leftChild);
        assertTrue(leftChild.text().isEmpty());
    }

}