package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;

public class GeneratedRunInternalNullOutlineTest {

    @Test
    public void runInternalNullOutlineTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline outline = null;
        try {
            xmlElementWrapperPlugin.runInternal(outline);
        } catch (NullPointerException e) {
            // Expected NullPointerException to be thrown
        } catch (Exception e) {
            Assert.fail("Expected NullPointerException to be thrown");
        }
    }

}