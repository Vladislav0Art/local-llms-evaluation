package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedFromClasspathUtf8_ReturnsBuilder {

    @Test
    public void fromClasspathUtf8_ReturnsBuilder() {
        String resource = "test";
        assertSame(WordWrap.fromClasspathUtf8(resource), WordWrap.from());
    }

}