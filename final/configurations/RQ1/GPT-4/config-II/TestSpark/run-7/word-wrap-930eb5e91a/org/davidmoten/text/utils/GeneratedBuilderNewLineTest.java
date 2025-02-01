package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class GeneratedBuilderNewLineTest {

    @Test
    public void BuilderNewLineTest() {
        WordWrap.Builder builder = WordWrap.from("Test").newLine("\r\n");
        assertEquals("\r\n", builder.newLine);
    }

}