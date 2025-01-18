package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;

public class GeneratedRunInternalWithOutlineTest {

    @Test
    public void runInternalWithOutlineTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline outline = Mockito.mock(Outline.class);
        ClassOutline classOutline = Mockito.mock(ClassOutline.class);
        Mockito.when(outline.getClasses()).thenReturn(Collections.singletonList(classOutline));
        try {
            xmlElementWrapperPlugin.runInternal(outline);
        } catch (Exception e) {
            Assert.fail("No exception should be thrown");
        }
    }

}