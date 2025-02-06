package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitTextOffSetFromStartOfStringTest {

    @Mock
    private Appendable accum;

    @Test
    public void splitTextOffSetFromStartOfStringTest() {
        String s = "test";
        TextNode node = new TextNode(s);
        when(this.text()).thenReturn(s);
        assertEquals(1, node.splitText(1));
    }

}