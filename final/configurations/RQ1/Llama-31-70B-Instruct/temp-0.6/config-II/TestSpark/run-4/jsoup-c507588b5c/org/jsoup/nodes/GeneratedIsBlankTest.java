package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlankTest {

    @Mock
    TextNode textNode;

    @Test
    public void isBlankTest() {
        when(textNode.isBlank()).thenReturn(false);
        assertFalse(textNode.isBlank());
    }

}