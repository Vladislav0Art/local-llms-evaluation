package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;
import javax.annotation.Nullable;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("data");
        assertEquals("#comment", comment.nodeName());
    }

}