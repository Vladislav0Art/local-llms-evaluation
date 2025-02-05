package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedRunInternalClassNotFoundExceptionTest {

    @Test
    public void runInternalClassNotFoundExceptionTest() throws Exception {
        Outline outline = mock(Outline.class);
        XmlElementWrapperPlugin wrapperPlugin = new XmlElementWrapperPlugin();
        wrapperPlugin.runInternal(outline);
    }

}