package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.*;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedRunInternalClassNotFoundExceptionTest {

    @Test
    public void runInternalClassNotFoundExceptionTest() throws IOException, ClassNotFoundException {
        XmlElementWrapperPlugin xewPlugin = new XmlElementWrapperPlugin();
        Outline mockOutline = Mockito.mock(Outline.class);

        Mockito.doThrow(new ClassNotFoundException("Test Exception")).when(mockOutline).getCodeModel();

        try {
            xewPlugin.runInternal(mockOutline);
            Assert.fail("Expected ClassNotFoundException to be thrown");
        } catch (ClassNotFoundException e) {
            Assert.assertEquals("Test Exception", e.getMessage());
        }
    }

}