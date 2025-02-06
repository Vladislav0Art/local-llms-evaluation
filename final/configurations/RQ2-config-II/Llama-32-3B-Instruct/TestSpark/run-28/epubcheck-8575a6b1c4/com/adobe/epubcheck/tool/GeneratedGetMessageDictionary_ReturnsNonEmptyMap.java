package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedGetMessageDictionary_ReturnsNonEmptyMap {

    @Test
    public void getMessageDictionary_ReturnsNonEmptyMap() {
        LocalizableReport report = new LocalizableReport();
        assertEquals(1, report.getMessageDictionary().size());
    }
}

}