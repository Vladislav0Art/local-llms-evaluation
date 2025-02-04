package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.jsoup.nodes.TextNode.NORMALISED_WHITE_SPACE;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWhenTrimmingLeadingAndTrailingSpaces_thenTrimmedTextIsReturned {

    @Mock
    private Node parentNode;

    @Mock
    private Document document;

    @Test
    public void whenTrimmingLeadingAndTrailingSpaces_thenTrimmedTextIsReturned() {
        String text = "   Hello World  ";
        assertEquals("Hello World", StringUtil.stripLeadingWhitespace(text));
    }

}