package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

public class GeneratedXmlElementWrapperPluginConstructorTest {

    @Test
    public void xmlElementWrapperPluginConstructorTest() {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();

        assertNotNull(xmlElementWrapperPlugin);
    }

}