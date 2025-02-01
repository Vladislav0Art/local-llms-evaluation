package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneratedStringWidthTest {

    @Test
    public void stringWidthTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        builder.stringWidth(CharSequence::length);
    }

}