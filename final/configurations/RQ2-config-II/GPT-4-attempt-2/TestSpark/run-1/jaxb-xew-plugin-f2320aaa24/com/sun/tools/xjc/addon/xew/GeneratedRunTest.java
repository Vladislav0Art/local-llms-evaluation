package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.CodeWriter;
import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;

import static org.mockito.Mockito.mock;

import org.junit.Test;

public class GeneratedRunTest {

    @Test
    public void runTest() throws Exception {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        JCodeModel codeModel = new JCodeModel();
        CodeWriter codeWriter = mock(CodeWriter.class);
        Outline outline = mock(Outline.class);
        Options opt = mock(Options.class);
        xmlElementWrapperPlugin.run(opt, codeModel, codeWriter, outline);
    }

}