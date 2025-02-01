package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class GeneratedBuilderMaxWidthTest {

    @Test
    public void BuilderMaxWidthTest() {
        WordWrap.Builder builder = WordWrap.from("Test").maxWidth(100);
        assertEquals(100, builder.maxWidth.intValue());
    }

}