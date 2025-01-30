package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.File;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedInsertHyphensTest {

    @Test
    public void insertHyphensTest() {
        Builder builder = WordWrap.from("test");
        builder.insertHyphens(true);
        assertEquals(builder.insertHyphens, true);
    }

}