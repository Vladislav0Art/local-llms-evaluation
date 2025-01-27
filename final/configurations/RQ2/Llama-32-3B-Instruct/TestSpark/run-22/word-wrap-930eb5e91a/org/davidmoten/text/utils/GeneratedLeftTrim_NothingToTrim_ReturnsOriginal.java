package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedLeftTrim_NothingToTrim_ReturnsOriginal {

    @Test
    public void leftTrim_NothingToTrim_ReturnsOriginal() {
        StringBuilder original = new StringBuilder();
        StringBuilder2 trimmed = WordWrap.leftTrim(original);
        assertEquals(original.toString(), trimmed.toString());
    }

}

public class Builder {
    // implementation

}

public class TestHelper {

    public static PrintWriter createPrintWriter(String fileName) throws IOException {
        return new PrintWriter(new FileWriter(fileName));
    }

}