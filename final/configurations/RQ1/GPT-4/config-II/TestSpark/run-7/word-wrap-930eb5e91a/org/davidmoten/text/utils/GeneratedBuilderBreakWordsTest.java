package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class GeneratedBuilderBreakWordsTest {

    @Test
    public void BuilderBreakWordsTest() {
        WordWrap.Builder builder = WordWrap.from("Test").breakWords(false);
        assertFalse(builder.breakWords);
    }

}