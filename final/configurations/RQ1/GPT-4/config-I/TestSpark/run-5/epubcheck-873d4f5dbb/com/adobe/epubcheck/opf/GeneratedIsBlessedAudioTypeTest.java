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

public class GeneratedIsBlessedAudioTypeTest {

    @Test
    public void isBlessedAudioTypeTest() {
        boolean result = OPFChecker30.isBlessedAudioType("audio/mpeg");
        assert (result);
    }

}