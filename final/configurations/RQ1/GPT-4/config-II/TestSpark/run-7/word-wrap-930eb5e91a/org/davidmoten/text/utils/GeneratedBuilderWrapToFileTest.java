package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class GeneratedBuilderWrapToFileTest {

    @Test
    public void BuilderWrapToFileTest() {
        String str = "This is a test String which needs to be wrapped when it hits the max width";
        WordWrap.Builder builder = WordWrap.from(str).maxWidth(10);
        File file = new File("test.txt");
        builder.wrap(file, java.nio.charset.StandardCharsets.UTF_8);
        assertTrue(file.exists());
        file.delete();
    }

}