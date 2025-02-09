package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.CodeWriter;
import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;

import static org.mockito.Mockito.mock;

import org.junit.Test;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.getVersion();
    }

}