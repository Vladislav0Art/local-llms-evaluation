package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSplitText_SplittingAtOffset_RaisesIndexOutOfBoundsException {

    @Test
    public void splitText_SplittingAtOffset_RaisesIndexOutOfBoundsException() {
        String text = "Hello World";
        int offset = 10;
        try {
            new TextNode(text).splitText(offset);
            fail();
        } catch (ArrayIndexOutOfBoundsException e) {
            // expected
        }
    }

}