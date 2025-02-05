package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedRunInternalTest {

    @Test
    public void RunInternalTest() throws ClassNotFoundException, IOException {
        // prepare
        JCodeModel jCodeModel = new JCodeModel();
        Outline outline = mock(Outline.class);
        when(outline.getCodeModel()).thenReturn(jCodeModel);
        Options options = new Options();

        // act
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.init(outline, options);
        plugin.runInternal(outline);

        // assert is done by checking the process did not throw any exceptions
    }

}