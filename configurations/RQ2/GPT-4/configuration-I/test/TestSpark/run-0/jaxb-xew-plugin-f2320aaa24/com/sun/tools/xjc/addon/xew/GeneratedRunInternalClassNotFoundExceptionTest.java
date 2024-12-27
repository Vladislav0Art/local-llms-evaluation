package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;

import com.sun.tools.xjc.Outline;

public class GeneratedRunInternalClassNotFoundExceptionTest {

    @Test
    public void runInternalClassNotFoundExceptionTest() throws Exception {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = mock(Outline.class);  // Assume Outline is some known class

        // when outline.getClass will be called then throw Exception
        when(outline.getClass()).thenThrow(Exception.class);

        plugin.runInternal(outline);
    }

}