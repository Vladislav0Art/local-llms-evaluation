package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;
import javax.annotation.Nullable;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        String data = "Hello World";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}