package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;

import com.sun.tools.xjc.Outline;

public class GeneratedRunInternalIOExceptionTest {

    @Test
    public void runInternalIOExceptionTest() throws Exception {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = mock(Outline.class);  // Assume Outline is some known class

        // when outline.getClass will be called then throw IOException
        when(outline.getClass()).thenThrow(IOException.class);

        plugin.runInternal(outline);
    }

}