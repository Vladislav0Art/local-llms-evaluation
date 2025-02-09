package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

import java.io.IOException;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadTest {

    @Mock
    Document.OutputSettings outputSettings;

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test comment");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, outputSettings);

        assertTrue(accum.length() > 0);
    }

}