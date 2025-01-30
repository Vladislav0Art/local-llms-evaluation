package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageDictionaryDumper;
import com.adobe.epubcheck.tool.EpubChecker;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;

public class GeneratedDumpMessageDictionaryTest {

    @Test
    public void dumpMessageDictionaryTest() throws IOException {
        Report mockedReport = Mockito.mock(Report.class);
        MessageDictionaryDumper mockedMessageDictionaryDumper = Mockito.mock(MessageDictionaryDumper.class);
        EpubChecker epubChecker = new EpubChecker();
        epubChecker.dumpMessageDictionary(mockedReport);
        Mockito.verify(mockedMessageDictionaryDumper).dump(Mockito.any());
    }

}