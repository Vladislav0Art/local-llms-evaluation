package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.fail;
import static org.junit.Assert.*;

import com.sun.tools.xjc.outline.Outline;
import org.mockito.Mockito;
import com.sun.tools.xjc.Outline;

public class GeneratedRunInternalGeneralCaseTest {

    @Test
    public void runInternalGeneralCaseTest() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            // Since we don't have a concrete implementation of Outline, null is passed
            plugin.runInternal(null);
        } catch (ClassNotFoundException | IOException e) {
            fail("Exception should not be thrown");
        }
    }

}