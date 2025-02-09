package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.ValidationContext;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedInitHandlerInvocationTest {

    @Test
    public void initHandlerInvocationTest() {
        ValidationContext context = new ValidationContext() {
            @Override
            public String getPath() {
                return "/path/to/file";
            }

            @Override
            public URL getRootUrl() {
                return null;
            }

            @Override
            public String getMimeType() {
                return "audio/mpeg";
            }
        };
        OPFChecker30 checker = new OPFChecker30(context);
        checker.initHandler();
    }

}