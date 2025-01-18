package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedRunInternalThrowsIOExceptionTest {

    @Test
    public void runInternalThrowsIOExceptionTest() throws IOException, ClassNotFoundException {
        Outline outline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();

        Mockito.doThrow(new IOException()).when(outline).getModel();

        plugin.runInternal(outline);
    }

}