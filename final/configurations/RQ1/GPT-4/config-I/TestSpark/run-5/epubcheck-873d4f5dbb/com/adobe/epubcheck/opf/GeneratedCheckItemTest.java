package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.opf.DocumentValidatorFactory;
import com.adobe.epubcheck.opf.OPFData;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.ValidationContext;
import com.adobe.epubcheck.util.URISchemeContentProvider;
import com.adobe.epubcheck.vocab.PackageVocabs;
import io.mola.galimatias.URL;
import org.junit.Test;

import java.util.Locale;

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() throws Exception {
        ValidationContext context = new ValidationContext(
                new Locale("en"),
                new URISchemeContentProvider(),
                new DefaultReportImpl("test", new Report.BypassReport()),
                "opf_path",
                EPUBVersion.VERSION_3,
                DocumentValidatorFactory.create("OPFChecker30"));

        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.defaultReport = new DefaultReportImpl("test", new Report.BypassReport());

        OPFHandler30 handler30 = new OPFHandler30(context);
        String location = "file://localhost/path/to/file";
        OPFItem item = new OPFItem("123", URL.parse(location), OPFData.OPFType.MIME);
        opfChecker30.checkItem(item, handler30);
    }

}