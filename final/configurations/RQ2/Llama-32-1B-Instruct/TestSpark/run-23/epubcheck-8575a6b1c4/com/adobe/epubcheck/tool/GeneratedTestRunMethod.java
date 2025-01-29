package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestRunMethod {

    @Test
    public void testRunMethod() throws Exception {
        String[] args = {"-e", "ebcdraft/1.2"};
        int count = EpubChecker.run(args);
        assertThat(count, is(0));
    }

}