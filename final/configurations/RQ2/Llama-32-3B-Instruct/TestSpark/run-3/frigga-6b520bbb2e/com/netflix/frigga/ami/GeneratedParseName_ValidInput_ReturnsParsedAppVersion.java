package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_ValidInput_ReturnsParsedAppVersion {

    @Mock
    private NameConstants.NameConstant nameConstant;

    @Test
    public void parseName_ValidInput_ReturnsParsedAppVersion() {
        String amiName = "1.0-1234567890";
        AppVersion parsedAppVersion = AppVersion.parseName(amiName);
        Mockito.verify(nameConstant).getNamePatternFor(amiName);
    }

}