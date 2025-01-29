package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestProcessEpubFileMethod {

    @Test
    public void testProcessEpubFileMethod() throws Exception {
        String[] args = {"-e", "ebcdraft/1.2", "example.epub"};
        int result = EpubChecker.processEpubFile(args);
        assertThat(result, is(-1)); // Error code for invalid options or files
    }

}