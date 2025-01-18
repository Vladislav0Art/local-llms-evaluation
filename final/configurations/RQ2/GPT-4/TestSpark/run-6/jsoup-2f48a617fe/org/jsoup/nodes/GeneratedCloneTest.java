package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test");
        Comment copy = comment.clone();

        assertTrue(comment != copy);
        assertTrue(comment.getClass() == copy.getClass());
        assertTrue(comment.equals(copy));
    }

}