package org.davidmoten.text.utils;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuilderWrapToListTest {

    @Test
    public void BuilderWrapToListTest() {
        List<String> result = new WordWrap.Builder(new StringReader("sample text"), false)
                .wrapToList();
        assertNotNull(result);
    }

}