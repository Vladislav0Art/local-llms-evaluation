package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;

public class GeneratedRunInternalThrowsExceptionTest {

    @Test
    public void runInternalThrowsExceptionTest() throws Exception {
        XmlElementWrapperPlugin wrapperPlugin = new XmlElementWrapperPlugin();

        Outline outline = mock(Outline.class);

        wrapperPlugin.runInternal(outline);
    }

}