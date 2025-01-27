package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

import static org.mockito.Mockito.*;

public class GeneratedToStringContainsTextFromNode {

    @Test
    public void toStringContainsTextFromNode() {
        StringBuilder builder = mock(StringBuilder.class);
        LeafNode node = mock(LeafNode.class);
        when(node.toString()).thenReturn(builder);
        String result = new LeafNode().toString();
        verify(builder).append(result);
    }
}

}