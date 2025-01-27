package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class GeneratedValidateFile_ValidateSuccess {

    private final EpubChecker epubChecker = new EpubChecker();

    @Test
    public void validateFile_ValidateSuccess() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintWriter writer = new PrintWriter(outContent);
        String[] args = {"-o", "output"};

        EpubCheckFactory factory = EpubCheckFactory.getFactory();
        Checker checker = factory.createChecker(args, writer);

        Map<String, Object> validationContextBuilder = ValidationContextBuilder.getBuilder();
        validationContextBuilder.setOPFProfile("OPF-2.1.0");
        ValidationContext context = validationContextBuilder.build();

        int result = epubChecker.validateFile("path/to/epub/file", EPUBVersion.EPUB3, new DefaultReportImpl(), "profile");
        assertEquals(0, result);
    }

}