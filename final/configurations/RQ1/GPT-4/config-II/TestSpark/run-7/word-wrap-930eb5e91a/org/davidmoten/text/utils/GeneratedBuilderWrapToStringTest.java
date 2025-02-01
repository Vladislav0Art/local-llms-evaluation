package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class GeneratedBuilderWrapToStringTest {

    @Test
    public void BuilderWrapToStringTest() {
        String str = "This is a test String which needs to be wrapped when it hits the max width";
        WordWrap.Builder builder = WordWrap.from(str).maxWidth(10);
        assertNotNull(builder.wrap());
    }

}