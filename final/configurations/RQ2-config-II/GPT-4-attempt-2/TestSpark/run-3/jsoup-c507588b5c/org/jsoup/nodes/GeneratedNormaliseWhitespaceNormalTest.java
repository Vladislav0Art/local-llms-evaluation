package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceNormalTest {

    @Test
    public void normaliseWhitespaceNormalTest() {
        String text = TextNode.normaliseWhitespace("  spaced  text  ");
        Assert.assertNotEquals("  spaced  text  ", text);
        Assert.assertEquals(" spaced text ", text);
    }

}