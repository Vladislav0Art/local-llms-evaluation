package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JClass;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void runInternalClassNotFoundTest() throws Exception {
        // Arrange
        Outline outlineMock = mock(Outline.class);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();

        // Act
        xmlElementWrapperPlugin.runInternal(outlineMock);
    }

    @Test
    public void runInternalIOExceptionTest() throws Exception {
        // Arrange
        Outline outlineMock = mock(Outline.class);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();

        // Act
        xmlElementWrapperPlugin.runInternal(outlineMock);
    }

    @Test
    public void runInternalNoExceptionTest() throws Exception {
        // Arrange
        Outline outlineMock = mock(Outline.class);
        JClass jClassMock = mock(JClass.class);
        when(outlineMock.getContainer(jClassMock, JMod.PUBLIC)).thenReturn(jclassMock);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();

        // Act
        xmlElementWrapperPlugin.runInternal(outlineMock);

        // Assert
        // Verify that the method didn't throw an exception.
    }

}