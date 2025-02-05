package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;

public class GeneratedTest {

    @Test
    public void runInternalScenario1Test() throws ClassNotFoundException, IOException {
        Outline mockOutline = Mockito.mock(Outline.class);
        Options mockOptions = Mockito.mock(Options.class);
        Mockito.when(mockOutline.getCodeModel()).thenReturn(new JCodeModel());
        Mockito.when(mockOutline.getContext()).thenReturn(mockOptions);
        List<ClassOutline> classOutlines = new ArrayList<>();
        Mockito.when(mockOutline.getClasses()).thenReturn(classOutlines);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.init(mockOptions);
        xmlElementWrapperPlugin.runInternal(mockOutline);
    }

    @Test
    public void runInternalScenario2Test() throws ClassNotFoundException, IOException {
        Outline mockOutline = Mockito.mock(Outline.class);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(mockOutline);
    }

    @Test
    public void runInternalScenario3Test() throws ClassNotFoundException, IOException {
        Outline mockOutline = Mockito.mock(Outline.class);
        Mockito.when(mockOutline.getCodeModel()).thenReturn(null);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(mockOutline);
    }

    @Test
    public void initTest() {
        Options mockOptions = Mockito.mock(Options.class);
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.init(mockOptions);
        Assert.assertNotNull("XmlElementWrapperPlugin options should not be null after initialization", xmlElementWrapperPlugin.getOptions());
    }

}