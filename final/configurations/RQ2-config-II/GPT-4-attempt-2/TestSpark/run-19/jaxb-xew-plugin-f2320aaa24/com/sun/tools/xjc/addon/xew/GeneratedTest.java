package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void runInternalClassNotFoundExceptionTest() throws ClassNotFoundException, IOException {
        // Arrange
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline mockOutline = Mockito.mock(Outline.class);
        Mockito.when(mockOutline.getCodeModel()).thenReturn(new JCodeModel());
        Mockito.when(mockOutline.getOptions()).thenReturn(new Options());

        // Act
        xmlElementWrapperPlugin.runInternal(mockOutline);
    }

    @Test
    public void runInternalIOExceptionTest() throws ClassNotFoundException, IOException {
        // Arrange
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline mockOutline = Mockito.mock(Outline.class);
        Mockito.when(mockOutline.getCodeModel()).thenReturn(new JCodeModel());
        Mockito.when(mockOutline.getOptions()).thenThrow(new IOException());

        // Act
        xmlElementWrapperPlugin.runInternal(mockOutline);
    }

}