package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedBuilderWrapFileTest {

    @Test
    public void builderWrapFileTest() throws IOException {
        WordWrap.Builder builder = WordWrap.from("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        builder.wrapUtf8("file.txt");
    }

}