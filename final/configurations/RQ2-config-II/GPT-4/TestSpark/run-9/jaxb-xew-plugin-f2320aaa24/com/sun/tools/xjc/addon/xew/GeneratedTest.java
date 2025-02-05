package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.model.CCustomizations;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void runInternalNotNullOutlineTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline outline = Mockito.mock(Outline.class);
        Mockito.when(outline.getCodeModel()).thenReturn(new JCodeModel());
        Mockito.when(outline.getCustomizations()).thenReturn(new CCustomizations());
        Mockito.when(outline.getClasses()).thenReturn(null);
        Mockito.when(outline.getClassFactory()).thenReturn(null);

        xmlElementWrapperPlugin.setOption(new Options());
        xmlElementWrapperPlugin.runInternal(outline);
        Assert.assertTrue(true); // if no exceptions, the test is successful
    }

    @Test
    public void runInternalNullOutlineTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.setOption(new Options());
        xmlElementWrapperPlugin.runInternal(null);
    }

    @Test
    public void getOptionsNotNullTest() {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Options options = new Options();
        xmlElementWrapperPlugin.setOption(options);
        Assert.assertEquals(options, xmlElementWrapperPlugin.getOption());
    }

    @Test
    public void getOptionsNullTest() {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.setOption(null);
        Assert.assertNull(xmlElementWrapperPlugin.getOption());
    }

    @Test
    public void getAcceptedAnnotationNotNullTest() {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Assert.assertNotNull(xmlElementWrapperPlugin.getAcceptedAnnotation());
        Assert.assertEquals(XmlElementWrapper.class, xmlElementWrapperPlugin.getAcceptedAnnotation());
    }

    @Test
    public void getAcceptedAnnotationNullTest() {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Assert.assertNotNull(xmlElementWrapperPlugin.getAcceptedAnnotation());
        Assert.assertNotEquals(XmlElement.class, xmlElementWrapperPlugin.getAcceptedAnnotation());
    }

}