package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.*;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void runInternalNullOutlineTest() throws IOException, ClassNotFoundException {
        XmlElementWrapperPlugin xewPlugin = new XmlElementWrapperPlugin();
        Outline mockOutline = null;

        try {
            xewPlugin.runInternal(mockOutline);
            Assert.fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
            Assert.assertEquals("Null pointer exception not thrown", "Null outline exception", e.getMessage());
        }
    }

    @Test
    public void runInternalValidOutlineTest() throws IOException, ClassNotFoundException {
        XmlElementWrapperPlugin xewPlugin = new XmlElementWrapperPlugin();
        Outline mockOutline = Mockito.mock(Outline.class);

        try {
            xewPlugin.runInternal(mockOutline);
        } catch (Exception e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }

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