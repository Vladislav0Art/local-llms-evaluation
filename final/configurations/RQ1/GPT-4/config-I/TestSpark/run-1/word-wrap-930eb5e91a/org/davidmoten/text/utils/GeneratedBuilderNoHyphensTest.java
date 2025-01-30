package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedBuilderNoHyphensTest {

    @Test
    public void builderNoHyphensTest() {
        WordWrap.Builder builder = WordWrap.from("Supercalifragilisticexpialidocious");
        builder.insertHyphens(false);
        builder.maxWidth(10);
        String result = builder.wrap();
        assertFalse("Should not contain hyphen in the result.", result.contains("-"));
    }

}