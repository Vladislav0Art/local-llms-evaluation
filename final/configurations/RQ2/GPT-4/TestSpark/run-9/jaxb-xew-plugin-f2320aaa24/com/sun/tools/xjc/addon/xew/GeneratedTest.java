package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class GeneratedTest {

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

    @Test
    public void runInternalWithEmptyOutlineTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline outline = Mockito.mock(Outline.class);
        Mockito.when(outline.getClasses()).thenReturn(Collections.emptyList());
        try {
            xmlElementWrapperPlugin.runInternal(outline);
        } catch (Exception e) {
            Assert.fail("No exception should be thrown");
        }
    }

}