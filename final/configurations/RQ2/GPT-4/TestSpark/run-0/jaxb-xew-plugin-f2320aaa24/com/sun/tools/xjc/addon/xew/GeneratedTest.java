package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void runInternalTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline mockOutline = mock(Outline.class);
        plugin.runInternal(mockOutline);
        verify(mockOutline, times(1)).getAllPackageContexts();
    }

}