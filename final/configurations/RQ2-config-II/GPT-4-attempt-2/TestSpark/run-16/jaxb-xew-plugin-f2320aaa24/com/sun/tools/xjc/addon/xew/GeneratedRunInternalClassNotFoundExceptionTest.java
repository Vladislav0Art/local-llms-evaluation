package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;

import java.io.IOException;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedRunInternalClassNotFoundExceptionTest {

    @Test
    public void runInternalClassNotFoundExceptionTest() throws ClassNotFoundException, IOException {
        Outline outline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(outline);
    }

}