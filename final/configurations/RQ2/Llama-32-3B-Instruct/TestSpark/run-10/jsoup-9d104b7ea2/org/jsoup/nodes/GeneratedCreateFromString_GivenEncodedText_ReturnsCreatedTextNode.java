package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCreateFromString_GivenEncodedText_ReturnsCreatedTextNode {

    @Test
    public void createFromString_GivenEncodedText_ReturnsCreatedTextNode() {
        String encodedText = "encoded";
        TextNode actual = TextNode.createFromEncoded(encodedText);
        assertNotNull(actual);
    }

}