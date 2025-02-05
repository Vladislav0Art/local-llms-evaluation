package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JPackage;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedRunInternal_IOException_ShouldThrow {

    @Test
    public void runInternal_IOException_ShouldThrow() throws Exception {
        // Arrange
        Outline outline = Mockito.mock(Outline.class);
        when(outline.getCodeModel()).thenThrow(new IOException());
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();

        // Act
        plugin.runInternal(outline);
    }

}