package com.sun.tools.xjc.addon.xew;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.sun.tools.xjc.outline.Outline;

import java.io.IOException;
import javax.xml.namespace.QName;

import org.junit.Test;

public class GeneratedRunInternalClassNotFoundExceptionTest {

    @Test
    public void runInternalClassNotFoundExceptionTest() throws ClassNotFoundException, IOException {
        // arrange
        XmlElementWrapperPlugin plugin = spy(XmlElementWrapperPlugin.class);
        Outline outline = mock(Outline.class);
        doThrow(new ClassNotFoundException()).when(plugin).runInternal(outline);

        // act
        plugin.runInternal(outline);
    }

}