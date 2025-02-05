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

public class GeneratedGetOptionsNotNullTest {

    @Test
    public void getOptionsNotNullTest() {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Options options = new Options();
        xmlElementWrapperPlugin.setOption(options);
        Assert.assertEquals(options, xmlElementWrapperPlugin.getOption());
    }

}