package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

public class GeneratedValidateFileNonexistentTest {

    @Test
    public void validateFileNonexistentTest() {
        EpubChecker epubChecker = new EpubChecker();
        String nonExistentPath = "~/nonexistentfile.epub";
        EPUBVersion version = EPUBVersion.VERSION_2;
        EPUBProfile profile = EPUBProfile.DEFAULT;
        Report reportMock = Mockito.mock(Report.class);

        int status = epubChecker.validateFile(nonExistentPath, version, reportMock, profile);
        Assert.assertEquals("Validating non-existent file should return failure status (-1).", -1, status);

        Mockito.verify(reportMock).message(Mockito.any(MessageId.class), Mockito.anyString(), Mockito.any());
    }

}