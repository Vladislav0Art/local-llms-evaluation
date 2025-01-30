package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.ocf.OCFChecker;
import com.adobe.epubcheck.opf.OPFData;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.ValidationContextTestStub;
import com.adobe.epubcheck.reporting.ValidationReport;
import com.adobe.epubcheck.typesetter.Typesetter;
import com.adobe.epubcheck.vocab.PackageVocabs;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import io.mola.galimatias.URL;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCheckPackageTest {

    @Test
    public void checkPackageTest() {
        File file = new File("test1.epub");
        ValidationContext context = new ValidationContextTestStub(new ValidationReport(), file);
        OPFChecker30 checker = new OPFChecker30(context);
        assertFalse(checker.checkPackage());
    }

}