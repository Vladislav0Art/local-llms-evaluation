package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeneratedFrom_Reader_Close {

    @Test
    public void from_Reader_Close() {
        Reader reader = new BufferedReader(new InputStreamReader(System.in));
        when(WordWrap.class).thenAnswer((ans) -> {
            return ans.get();
        });
        Builder builder = WordWrap.from(reader, true);
        builder.build();
        Assert.assertTrue(WordWrap.class).getClose(reader);
    }

}