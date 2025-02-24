package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTextSetterExceptionTest {

    @Test
    public void textSetterExceptionTest() {
        TextNode node = new TextNode("test");
        node.text(null);
    }

}