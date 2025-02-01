package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneratedMaxWidthLessThanZeroTest {

    @Test
    public void maxWidthLessThanZeroTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        builder.maxWidth(-1);
    }

}