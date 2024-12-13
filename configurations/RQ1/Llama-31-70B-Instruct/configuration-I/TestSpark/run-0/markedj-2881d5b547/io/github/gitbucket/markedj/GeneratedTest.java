package io.github.gitbucket.markedj;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void markedWithoutOptionsAndRendererTest() {
        String src = "This is a test";
        String expected = "This is a test";

        String actual = Marked.marked(src);

        assertEquals(expected, actual);
    }

    @Test
    public void markedWithOptionsTest() {
        String src = "This is a test";
        Options options = new Options();
        String expected = "This is a test";

        String actual = Marked.marked(src, options);

        assertEquals(expected, actual);
    }

    @Test
    public void markedWithOptionsAndRendererTest() {
        String src = "This is a test";
        Options options = new Options();
        Renderer renderer = new Renderer(options);
        String expected = "This is a test";

        String actual = Marked.marked(src, options, renderer);

        assertEquals(expected, actual);
    }

}