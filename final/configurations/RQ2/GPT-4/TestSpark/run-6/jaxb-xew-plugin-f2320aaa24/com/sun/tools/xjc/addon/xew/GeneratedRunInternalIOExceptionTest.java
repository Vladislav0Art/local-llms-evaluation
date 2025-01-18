package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.*;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedRunInternalIOExceptionTest {

    @Test
    public void runInternalIOExceptionTest() throws IOException, ClassNotFoundException {
        XmlElementWrapperPlugin xewPlugin = new XmlElementWrapperPlugin();
        Outline mockOutline = Mockito.mock(Outline.class);

        Mockito.doThrow(new IOException("Test Exception")).when(mockOutline).getCodeModel();

        try {
            xewPlugin.runInternal(mockOutline);
            Assert.fail("Expected IOException to be thrown");
        } catch (IOException e) {
            Assert.assertEquals("Test Exception", e.getMessage());
        }
    }

}