package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.Validate.isBlank;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedClone {

    @Mock
    private String text;

    @Mock
    private StringBuilder sb;

    private TextNode node = new TextNode(text);

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    public static void main(String[] args) throws Exception {
        org.junit.runner.JUnitCore.main("org.jsoup.nodes.TextNodeTest");
    }

    @Test
    public void clone() {
        TextNode cloned = node.clone();
        assertNotNull(cloned);
        assertEquals(text, cloned.text());
    }

}