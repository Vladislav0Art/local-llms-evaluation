package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedAddMessage_AddsMessageToDictionary {

    @Test
    public void addMessage_AddsMessageToDictionary() {
        LocalizableReport report = new LocalizableReport();
        report.addMessage("key", "value");
        assertNotNull(report.getMessageDictionary());
    }

}