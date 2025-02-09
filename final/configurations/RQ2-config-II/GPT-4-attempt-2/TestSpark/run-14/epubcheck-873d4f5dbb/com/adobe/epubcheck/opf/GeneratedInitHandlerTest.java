package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedInitHandlerTest {

    @Test
    public void initHandlerTest() {
        ValidationContext context = new ValidationContext(EPUBVersion.VERSION_3, "path", "mimetype");
        OPFChecker30 checker = new OPFChecker30(context);

        checker.initHandler();
        // Add assertions if needed
    }

}