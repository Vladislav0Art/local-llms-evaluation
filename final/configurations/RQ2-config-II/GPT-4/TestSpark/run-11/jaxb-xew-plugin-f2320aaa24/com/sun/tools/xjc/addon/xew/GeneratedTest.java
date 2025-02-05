package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.mockito.Mockito;
import com.sun.tools.xjc.outline.Outline;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void runInternalValidOutlineTest() throws Exception {
        Outline outline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(outline);
        assertNotNull(xmlElementWrapperPlugin);
    }

    @Test
    public void runInternalOutlineClassNotFoundExceptionThrownTest() throws Exception {
        Outline outline = Mockito.mock(Outline.class);
        Mockito.doThrow(ClassNotFoundException.class).when(outline).getClazz();
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(outline);
    }

    @Test
    public void runInternalOutlineIOExceptionThrownTest() throws Exception {
        Outline outline = Mockito.mock(Outline.class);
        Mockito.doThrow(IOException.class).when(outline).getClazz();
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(outline);
    }

}