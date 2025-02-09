package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlankTest {

    @Mock
    Document.OutputSettings outputSettings;

    @Test
    public void isBlankTest() {
        TextNode blankNode = new TextNode(" ");
        assertTrue(blankNode.isBlank());

        TextNode nonBlankNode = new TextNode("NonBlank");
        assertFalse(nonBlankNode.isBlank());
    }

}