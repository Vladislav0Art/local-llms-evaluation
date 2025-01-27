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

public class GeneratedFromClasspathUtf8_SimpleResource {

    @Test
    public void fromClasspathUtf8_SimpleResource() {
        String resource = "text";
        Builder builder = WordWrap.fromClasspathUtf8(resource);
        Assert.assertNotNull(builder);
    }

}