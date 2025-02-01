package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class GeneratedBuilderInsertHyphensTest {

    @Test
    public void BuilderInsertHyphensTest() {
        WordWrap.Builder builder = WordWrap.from("Test").insertHyphens(false);
        assertFalse(builder.insertHyphens);
    }

}