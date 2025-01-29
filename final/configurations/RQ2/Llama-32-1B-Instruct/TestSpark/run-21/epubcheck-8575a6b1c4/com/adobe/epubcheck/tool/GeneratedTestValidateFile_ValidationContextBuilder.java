package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestValidateFile_ValidationContextBuilder {

    @Test
    public void testValidateFile_ValidationContextBuilder() {
        String[] args = {"-v", "2.1.0", "-e", "https://example.com/ebook.ept", "-o", "/tmp/ebook.ept"};
        EpubChecker check = new EpubChecker();
        ValidationContext validationContext = Mockito.mock(ValidationContext.class);
        Mockito.when(validationContext.build()).thenReturn(new ValidationContextBuilder().build());
        int result = check.validateFile(args[0], null, Mockito.mock(EPUBProfile.class), validationContext);
        assertEquals(1, result);
    }

}