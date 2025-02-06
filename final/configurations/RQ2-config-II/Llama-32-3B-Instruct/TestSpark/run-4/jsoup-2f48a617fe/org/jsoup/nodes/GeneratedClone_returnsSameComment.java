package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedClone_returnsSameComment {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private Parser parser;

    @Test
    public void clone_returnsSameComment() {
        Comment comment = new Comment("data");
        Comment cloned = comment.clone();
        assertTrue(comment == cloned);
    }

}