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

public class GeneratedRunInternalNotNullOutlineTest {

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

}