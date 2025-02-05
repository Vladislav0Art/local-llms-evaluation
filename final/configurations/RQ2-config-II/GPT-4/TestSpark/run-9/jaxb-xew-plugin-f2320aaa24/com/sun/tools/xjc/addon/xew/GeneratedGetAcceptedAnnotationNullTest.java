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

public class GeneratedGetAcceptedAnnotationNullTest {

    @Test
    public void getAcceptedAnnotationNullTest() {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Assert.assertNotNull(xmlElementWrapperPlugin.getAcceptedAnnotation());
        Assert.assertNotEquals(XmlElement.class, xmlElementWrapperPlugin.getAcceptedAnnotation());
    }

}