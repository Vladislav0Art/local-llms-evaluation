package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Locale;

public class GeneratedValidateFileExistButInvalidTest {

    @Test
    public void validateFileExistButInvalidTest() {
        EpubChecker epubChecker = new EpubChecker();
        String invalidPath = "./invalid.epub";
        // Assume the file 'invalid.epub' at the path, and it's an invalid epub file.
        EPUBVersion version = EPUBVersion.VERSION_2;
        EPUBProfile profile = EPUBProfile.DEFAULT;
        Report reportMock = Mockito.mock(Report.class);

        int status = epubChecker.validateFile(invalidPath, version, reportMock, profile);
        Assert.assertEquals("Validating invalid file should return failure status (-1).", -1, status);

        Mockito.verify(reportMock).message(Mockito.any(MessageId.class), Mockito.anyString(), Mockito.any());
    }

}