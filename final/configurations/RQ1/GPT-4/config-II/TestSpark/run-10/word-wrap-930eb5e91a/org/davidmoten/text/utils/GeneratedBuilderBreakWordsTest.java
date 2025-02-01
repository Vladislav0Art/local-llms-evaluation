package org.davidmoten.text.utils;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuilderBreakWordsTest {

    @Test
    public void BuilderBreakWordsTest() {
        WordWrap.Builder builder = new WordWrap.Builder(new StringReader(""), false)
                .breakWords(true);
        assertNotNull(builder);
    }

}