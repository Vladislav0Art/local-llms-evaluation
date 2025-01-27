package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedRunHelpMessageTest {

    @Test
    public void runHelpMessageTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        outContent.write(("java -h\n" + MessagesHELP_MESSAGE).getBytes());
        PrintWriter pw = new PrintWriter(outContent);
        EpubChecker.run(new String[]{"-h"});
        pw.close();
        assertTrue(outContent.toString().contains(MessagesHELP_MESSAGE));
    }

}