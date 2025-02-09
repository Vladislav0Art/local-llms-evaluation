package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetWholeTextTest {

    @Mock
    Document.OutputSettings outputSettings;

    @Test
    public void getWholeTextTest() {
        TextNode node = new TextNode("Whole text");
        assertThat(node.getWholeText(), is("Whole text"));
    }

}