package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternal_ThrowsIOExceptionWhenReadingFileFails {

    @Mock
    private Outline outlineMock;

    public XmlElementWrapperPluginTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void runInternal_ThrowsIOExceptionWhenReadingFileFails() throws Exception, IOException {
        when(outlineMock.toString()).thenThrow(IOException.class);
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.runInternal(outlineMock);
            assertEquals("IOException", "Error reading file", Mockito.anyString());
        } catch (IOException e) {
            assertEquals(e.getMessage(), "Error reading file");
        }
    }

}