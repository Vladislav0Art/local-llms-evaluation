package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneratedMaxWidthTest {

    @Test
    public void maxWidthTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        builder.maxWidth(10);
    }

}