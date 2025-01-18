package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void runInternalDoesntThrowExceptionTest() throws IOException, ClassNotFoundException {
        Outline outline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();

        // No exception is expected here
        plugin.runInternal(outline);

        Mockito.verify(outline, Mockito.times(1)).getModel();
    }

    @Test
    public void runInternalThrowsIOExceptionTest() throws IOException, ClassNotFoundException {
        Outline outline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();

        Mockito.doThrow(new IOException()).when(outline).getModel();

        plugin.runInternal(outline);
    }

    @Test
    public void runInternalThrowsClassNotFoundExceptionTest() throws IOException, ClassNotFoundException {
        Outline outline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();

        Mockito.doThrow(new ClassNotFoundException()).when(outline).getModel();

        plugin.runInternal(outline);
    }

}