package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedRun_validArgs_returnsZero {

    public Locale getLocale() {
        return Locale.US;
    }

    @Test
    public void run_validArgs_returnsZero() {
        String[] args = {"arg1", "arg2"};
        assertEquals(0, epubChecker.run(args));
    }
}

public class DefaultReportImpl implements Report {

    @Override
    public String getErrorMessage() {
        return "";
    }

    @Override
    public boolean isFailure() {
        return false;
    }

    @Override
    public int getVersion() {
        return 0;
    }
}

}