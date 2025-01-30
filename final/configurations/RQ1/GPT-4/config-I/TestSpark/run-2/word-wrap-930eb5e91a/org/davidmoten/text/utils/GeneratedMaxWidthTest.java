package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class GeneratedMaxWidthTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void maxWidthTest() {
        WordWrap.Builder builder = WordWrap.from("This is a test string");
        builder.maxWidth(10);
        List<String> actual = builder.wrapToList();
        List<String> expected = Arrays.asList("This is a", "test string");
        assertEquals(expected, actual);
    }

}