package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

public class GeneratedMaxWidthZeroTest {

    @Test
    public void maxWidthZeroTest() {
        String input = "Hello world";
        WordWrap.from(new StringReader(input)).maxWidth(0).wrap();
    }

}