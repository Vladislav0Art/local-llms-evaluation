package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheckFactory;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.messages.MessageDictionaryDumper;
import com.adobe.epubcheck.opf.OPFChecker;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.ops.OPSChecker;
import com.adobe.epubcheck.overlay.OverlayChecker;
import com.adobe.epubcheck.nav.NavChecker;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.Archive;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.FileResourceProvider;
import com.adobe.epubcheck.util.OPSType;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.File;

public class GeneratedRunVersionTest {

    @Test
    public void runVersionTest() {
        EpubChecker epubChecker = new EpubChecker();
        // When the version flag is passed the run method will not return an error
        assertEquals(0, epubChecker.run(new String[]{"-version"}));
    }

}