package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.*;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedRunInternalValidOutlineTest {

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

}