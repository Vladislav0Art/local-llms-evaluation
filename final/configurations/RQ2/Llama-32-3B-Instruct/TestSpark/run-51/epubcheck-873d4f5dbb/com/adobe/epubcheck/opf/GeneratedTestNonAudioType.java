package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestNonAudioType {

    @Mock
    public boolean result;

    @Test
    public void testNonAudioType() {
        String type = "non-audio";
        assertFalse(isAudioType(type));
    }

    private boolean isAudioType(String type) {
        return type.equals("audio");
    }

}