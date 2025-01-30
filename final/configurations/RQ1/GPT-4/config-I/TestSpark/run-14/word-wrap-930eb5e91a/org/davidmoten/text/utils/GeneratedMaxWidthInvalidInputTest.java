package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Function;

public class GeneratedMaxWidthInvalidInputTest {

    @Test
    public void maxWidthInvalidInputTest() {
        WordWrap.from("This is a normal text").maxWidth(-1).wrap();
    }

}