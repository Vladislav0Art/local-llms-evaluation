package com.sun.tools.xjc.addon.xew;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.sun.tools.xjc.outline.Outline;

import java.io.IOException;
import javax.xml.namespace.QName;

import org.junit.Test;

public class GeneratedRunInternalNoExceptionTest {

    @Test
    public void runInternalNoExceptionTest() throws ClassNotFoundException, IOException {
        // arrange
        XmlElementWrapperPlugin plugin = spy(XmlElementWrapperPlugin.class);
        Outline outline = mock(Outline.class);

        // act
        plugin.runInternal(outline);

        // assert
        verify(plugin, times(1)).runInternal(outline);
    }

}