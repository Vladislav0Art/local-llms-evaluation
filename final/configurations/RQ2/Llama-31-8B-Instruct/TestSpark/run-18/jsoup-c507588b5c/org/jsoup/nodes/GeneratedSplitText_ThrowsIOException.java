package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitText_ThrowsIOException {

    @Test
    public void splitText_ThrowsIOException() {
        TextNode textNode = new TextNode("test");
        IOException ioException = new IOException();
        when(textNode.splitText(0)).thenThrow(ioException);
        try {
            textNode.splitText(0);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals(ioException, e);
        }
    }

}