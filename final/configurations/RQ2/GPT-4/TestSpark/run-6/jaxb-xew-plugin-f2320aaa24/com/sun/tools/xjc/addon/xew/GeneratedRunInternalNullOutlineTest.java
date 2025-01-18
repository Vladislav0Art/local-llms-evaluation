package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.*;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedRunInternalNullOutlineTest {

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

}