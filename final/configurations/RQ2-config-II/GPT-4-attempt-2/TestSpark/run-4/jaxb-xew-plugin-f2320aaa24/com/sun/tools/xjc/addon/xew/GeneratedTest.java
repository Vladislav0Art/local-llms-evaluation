package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.*;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.model.CPropertyInfo;
import com.sun.tools.xjc.outline.FieldOutline;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void runInternalTest() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = Mockito.mock(Outline.class);
        Mockito.when(outline.getCodeModel()).thenReturn(new JCodeModel());

        try {
            plugin.runInternal(outline);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void runInternalWithExceptionTest() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = Mockito.mock(Outline.class);
        Mockito.when(outline.getCodeModel()).thenReturn(null);

        Boolean exceptionThrown = false;
        try {
            plugin.runInternal(outline);
        } catch (ClassNotFoundException | IOException e) {
            exceptionThrown = true;
        }
        Assert.assertTrue(exceptionThrown);
    }

}