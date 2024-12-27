package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedIsXmlDeclarationTest {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private int depth;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

}