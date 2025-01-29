package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestMainMethod {

    @Test
    public void testMainMethod() {
        String[] args = {"-e", "ebcdraft/1.2"};
        EpubCheckerchecker = new EpubChecker();
        int count = checker.main(args);
        assertThat(count, is(0));
    }

}