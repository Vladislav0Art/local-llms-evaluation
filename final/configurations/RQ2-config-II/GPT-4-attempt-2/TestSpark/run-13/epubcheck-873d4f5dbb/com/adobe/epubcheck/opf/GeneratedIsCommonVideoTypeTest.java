package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import io.mola.galimatias.URL;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedIsCommonVideoTypeTest {

    @Test
    public void isCommonVideoTypeTest() {
        String type = "video/x-ms-wmv";
        Assert.assertTrue(OPFChecker30.isCommonVideoType(type));
    }

}