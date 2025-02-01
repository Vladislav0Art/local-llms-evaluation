package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class GeneratedBuilderMaxWidthZeroTest {

    @Test
    public void BuilderMaxWidthZeroTest() {
        WordWrap.from("Test").maxWidth(0);
    }

}