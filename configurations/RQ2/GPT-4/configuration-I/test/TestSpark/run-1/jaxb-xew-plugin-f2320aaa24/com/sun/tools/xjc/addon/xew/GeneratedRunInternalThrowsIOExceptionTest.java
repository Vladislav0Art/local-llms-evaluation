package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.*;

import com.sun.tools.xjc.Outline;

public class GeneratedRunInternalThrowsIOExceptionTest {

    @Test
    public void runInternalThrowsIOExceptionTest() throws Exception {
        // Given
        Outline mockOutline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();

        // When
        plugin.runInternal(mockOutline);

        // Then an exception is expected to be thrown.
    }

}