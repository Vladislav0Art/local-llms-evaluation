package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void runInternalTest() throws ClassNotFoundException, IOException {
        Outline outline = Mockito.mock(Outline.class);
        Mockito.when(outline.getCodeModel()).thenReturn(new JCodeModel());
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.setOptions(new Options());
        plugin.runInternal(outline);
    }

}