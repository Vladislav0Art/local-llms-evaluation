package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3c.epubcheck.core.Checker;
import org.w3c.epubcheck.util.url.URLUtils;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageDictionaryDumper;
import com.adobe.epubcheck.nav.NavChecker;
import com.adobe.epubcheck.opf.OPFChecker;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.opf.ValidationContextValidationContextBuilder;
import com.adobe.epubcheck.ops.OPSChecker;
import com.adobe.epubcheck.overlay.OverlayChecker;
import com.adobe.epubcheck.reporting.CheckingReport;
import com.adobe.epubcheck.util.Archive;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.FeatureEnum;
import com.adobe.epubcheck.util.FileResourceProvider;
import com.adobe.epubcheck.util.GenericResourceProvider;
import com.adobe.epubcheck.util.InvalidVersionException;
import com.adobe.epubcheck.util.Messages;
import com.adobe.epubcheck.util.ReportingLevel;
import com.adobe.epubcheck.util.URLResourceProvider;
import com.adobe.epubcheck.util.XmlReportImpl;
import com.adobe.epubcheck.util.XmpReportImpl;
import com.adobe.epubcheck.util.outWriter;

public class GeneratedValidateFile_validation {

    @Test
    public void validateFile_validation() throws Exception {
        File file = new File("test.epub");
        int result = EpubChecker instance = new EpubChecker().validateFile(file.toURI(), EPUBVersion.V20, null, null);
        assertTrue(result >= 0 && result <= 100);
    }

}