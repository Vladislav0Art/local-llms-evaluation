package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedToStringIncludesNodeName {

    @Test
    public void toStringIncludesNodeName() {
        public Comment comment = new public Comment("This is a comment");
        String expectedOut = "<comment>This is a comment</comment>";
        assertEquals(expectedOut, comment.toString());
    }

}