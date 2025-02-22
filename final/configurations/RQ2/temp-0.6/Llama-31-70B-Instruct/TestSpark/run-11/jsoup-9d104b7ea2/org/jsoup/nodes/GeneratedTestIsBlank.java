package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestIsBlank {

    @Mock
    private TextNode textNode;

    @Test
    public void testIsBlank() {
        when(textNode.coreValue()).thenReturn("");
        assertTrue(textNode.isBlank());
    }

}