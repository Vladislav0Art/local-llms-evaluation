package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JClass;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedRunInternalIOExceptionTest {

    @Test
    public void runInternalIOExceptionTest() throws Exception {
        // Arrange
        Outline outlineMock = mock(Outline.class);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();

        // Act
        xmlElementWrapperPlugin.runInternal(outlineMock);
    }

}