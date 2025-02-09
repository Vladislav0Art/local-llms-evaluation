package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.model.CCustomizations;
import com.sun.tools.xjc.outline.Outline;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedRunInternalTest {

    @Test
    public void runInternalTest() throws ClassNotFoundException, IOException {
        // Arrange
        Outline mockOutline = Mockito.mock(Outline.class);
        CCustomizations customizations = new CCustomizations();

        Mockito.when(mockOutline.getCustomizations()).thenReturn(customizations);
        Mockito.when(mockOutline.getCodeModel()).thenReturn(new JCodeModel());

        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();

        // Act
        xmlElementWrapperPlugin.runInternal(mockOutline);

        // Assert
        Assert.assertTrue(customizations.isEmpty());
    }

}