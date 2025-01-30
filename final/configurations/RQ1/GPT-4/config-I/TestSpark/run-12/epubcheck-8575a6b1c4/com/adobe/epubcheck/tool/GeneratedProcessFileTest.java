package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.opf.ValidationContext;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.mockito.Mockito.*;

public class GeneratedProcessFileTest {

    @Test
    public void processFileTest() throws NoSuchFieldException, IllegalAccessException {
        EpubChecker epubChecker = new EpubChecker();
        Field field = EpubChecker.class.getDeclaredField("path");
        field.setAccessible(true);
        field.set(epubChecker, "invalidPath");

        int result = epubChecker.run(new String[]{});
        assert (result == 1);
    }

}