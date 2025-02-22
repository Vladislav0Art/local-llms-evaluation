package org.jsoup.nodes;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestIsBlank {

    @Mock
    TextNode textNode;

    @BeforeClass
    public static void setUp() {
        // Set up the test environment (if needed)
    }

    @Test
    public void testIsBlank() {
        when(textNode.isBlank()).thenReturn(true);
        assertEquals(true, textNode.isBlank());
    }

}