package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestIsAudioType {

    @Mock
    public OFItem item;

    @Mock
    public OPFHandler handler;

    private OPFChecker30 subject;

    @Before
    public void setup() {
        subject = new OPFChecker30();
    }

    @Test
    public void testIsAudioType() {
        String type = "audio";
        boolean result = isAudioType(type);
        assertTrue(result.equals("audio"));
    }

    private boolean isAudioType(String type) {
        return type.equals("audio");
    }

}