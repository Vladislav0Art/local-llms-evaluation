package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedRunInternalTest {

    @Test
    public void runInternalTest() throws Exception {
        Outline outlineMock = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();

        try {
            xmlElementWrapperPlugin.runInternal(outlineMock);
        } catch (Exception ex) {
            Assert.fail("Expected no exception, but got: " + ex.getMessage());
        }
    }

}