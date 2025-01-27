package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedInitHandler_EmptyContext_ReturnsTrue {

    @Test
    public void initHandler_EmptyContext_ReturnsTrue() {
        // arrange
        ValidationContext context = new ValidationContext();

        // act
        boolean result = OPFChecker30.initHandler(context);

        // assert
        assertTrue(result);
    }

}