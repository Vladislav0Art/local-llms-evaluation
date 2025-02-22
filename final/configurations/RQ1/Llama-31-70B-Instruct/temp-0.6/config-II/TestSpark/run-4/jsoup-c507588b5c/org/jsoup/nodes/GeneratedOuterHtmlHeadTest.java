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
public class GeneratedOuterHtmlHeadTest {

    @Mock
    TextNode textNode;

    @Test
    public void outerHtmlHeadTest() {
        when(textNode.outerHtmlHead(null, 0, null)).thenReturn(null);
    }

}