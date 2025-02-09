package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;

import java.io.IOException;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void runInternalClassNotFoundExceptionTest() throws ClassNotFoundException, IOException {
        Outline outline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(outline);
    }

    @Test
    public void runInternalIOExceptionTest() throws ClassNotFoundException, IOException {
        Outline outline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(outline);
    }

    @Test
    public void runInternalNoExceptionTest() throws ClassNotFoundException, IOException {
        // Or use a real (not mocked) Outline instance if possible
        Outline outline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(outline);
        // If no exception was thrown by now, the test passes. You can also add some assertions if appropriate for the tested method
    }

}