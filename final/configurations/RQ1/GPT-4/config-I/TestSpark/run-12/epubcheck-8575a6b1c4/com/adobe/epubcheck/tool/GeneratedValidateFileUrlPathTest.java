package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.opf.ValidationContext;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.mockito.Mockito.*;

public class GeneratedValidateFileUrlPathTest {

    @Test
    public void validateFileUrlPathTest() throws NoSuchFieldException, IllegalAccessException {
        EpubChecker epubChecker = new EpubChecker();
        Report report = mock(Report.class);

        Method validateFileMethod = EpubChecker.class.getDeclaredMethod("validateFile", String.class, EPUBVersion.class, Report.class, EPUBProfile.class);
        validateFileMethod.setAccessible(true);
        int result = (int) validateFileMethod.invoke(epubChecker, "http://google.com", EPUBVersion.VERSION_3, report, EPUBProfile.DEFAULT);

        assert (result == 1);
    }

}