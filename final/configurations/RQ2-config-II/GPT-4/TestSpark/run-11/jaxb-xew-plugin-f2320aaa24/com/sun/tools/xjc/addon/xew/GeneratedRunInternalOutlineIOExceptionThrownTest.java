package com.sun.tools.xjc.addon.xew;

import org.junit.Test;
import org.mockito.Mockito;
import com.sun.tools.xjc.outline.Outline;

import static org.junit.Assert.assertNotNull;

public class GeneratedRunInternalOutlineIOExceptionThrownTest {

    @Test
    public void runInternalOutlineIOExceptionThrownTest() throws Exception {
        Outline outline = Mockito.mock(Outline.class);
        Mockito.doThrow(IOException.class).when(outline).getClazz();
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(outline);
    }

}