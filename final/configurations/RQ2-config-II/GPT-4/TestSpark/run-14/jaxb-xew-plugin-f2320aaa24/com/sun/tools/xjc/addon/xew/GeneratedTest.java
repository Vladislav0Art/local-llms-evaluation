package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void runInternalClassNotFoundTest() throws Exception {
        Outline mockOutline = mock(Outline.class);
        when(mockOutline.getCodeModel()).thenReturn(new JCodeModel());

        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(mockOutline);
    }

    @Test
    public void runInternalIOExceptionTest() throws Exception {
        Outline mockOutline = mock(Outline.class);
        Options mockOptions = mock(Options.class);

        JCodeModel mockCodeModel = mock(JCodeModel.class);
        when(mockOutline.getCodeModel()).thenReturn(mockCodeModel);
        when(mockOutline.getOptions()).thenReturn(mockOptions);

        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(mockOutline);
    }

}