package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedConstructorHasCorrectData {

    @Test
    public void constructorHasCorrectData() {
        String data = "This is a comment";
        public Comment comment = new public Comment(data);
        assertEquals(data, comment.getData());
    }

}