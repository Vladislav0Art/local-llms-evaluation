package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedConstructor_hasCorrectData {

    @Test
    public void constructor_hasCorrectData() {
        Comment comment = new Comment("Test Data");
        assertEquals("Test Data", comment.getData());
    }

}