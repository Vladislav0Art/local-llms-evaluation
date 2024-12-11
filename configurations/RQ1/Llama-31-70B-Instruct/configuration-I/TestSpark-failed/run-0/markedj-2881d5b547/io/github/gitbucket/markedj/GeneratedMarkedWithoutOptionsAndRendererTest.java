package io.github.gitbucket.markedj;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedMarkedWithoutOptionsAndRendererTest {

    @Test
    public void markedWithoutOptionsAndRendererTest() {
        String src = "This is a test";
        String expected = "This is a test";

        String actual = Marked.marked(src);

        assertEquals(expected, actual);
    }

}