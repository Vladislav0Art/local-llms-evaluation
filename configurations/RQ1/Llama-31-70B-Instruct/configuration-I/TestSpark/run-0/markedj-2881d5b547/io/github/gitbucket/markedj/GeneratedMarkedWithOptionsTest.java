package io.github.gitbucket.markedj;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedMarkedWithOptionsTest {

    @Test
    public void markedWithOptionsTest() {
        String src = "This is a test";
        Options options = new Options();
        String expected = "This is a test";

        String actual = Marked.marked(src, options);

        assertEquals(expected, actual);
    }

}