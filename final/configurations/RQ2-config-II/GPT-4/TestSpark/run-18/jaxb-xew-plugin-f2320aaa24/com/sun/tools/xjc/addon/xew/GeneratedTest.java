package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void runInternalValidOutlineTest() throws Exception {
        Outline outline = mock(Outline.class);
        XmlElementWrapperPlugin wrapperPlugin = new XmlElementWrapperPlugin();
        wrapperPlugin.runInternal(outline);
    }

    @Test
    public void runInternalIOExceptionOccuredTest() throws Exception {
        Outline outline = mock(Outline.class);
        XmlElementWrapperPlugin wrapperPlugin = new XmlElementWrapperPlugin();
        wrapperPlugin.runInternal(outline);
    }

    @Test
    public void runInternalClassNotFoundExceptionTest() throws Exception {
        Outline outline = mock(Outline.class);
        XmlElementWrapperPlugin wrapperPlugin = new XmlElementWrapperPlugin();
        wrapperPlugin.runInternal(outline);
    }

}