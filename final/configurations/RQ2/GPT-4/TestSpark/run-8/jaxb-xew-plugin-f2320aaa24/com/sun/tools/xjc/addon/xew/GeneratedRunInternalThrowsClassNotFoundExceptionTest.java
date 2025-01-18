package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedRunInternalThrowsClassNotFoundExceptionTest {

    @Test
    public void runInternalThrowsClassNotFoundExceptionTest() throws IOException, ClassNotFoundException {
        Outline outline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();

        Mockito.doThrow(new ClassNotFoundException()).when(outline).getModel();

        plugin.runInternal(outline);
    }

}