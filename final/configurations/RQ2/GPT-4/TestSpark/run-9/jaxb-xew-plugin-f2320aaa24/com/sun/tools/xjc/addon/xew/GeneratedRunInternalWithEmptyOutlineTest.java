package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;

public class GeneratedRunInternalWithEmptyOutlineTest {

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