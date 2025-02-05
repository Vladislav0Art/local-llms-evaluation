package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedRunInternalTest {

    @Test
    public void runInternalTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin pluginUnderTest = new XmlElementWrapperPlugin();
        Outline outlineMock = Mockito.mock(Outline.class);
        Mockito.when(outlineMock.getCodeModel()).thenReturn(new JCodeModel());

        pluginUnderTest.runInternal(outlineMock);
    }

}