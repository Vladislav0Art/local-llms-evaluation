package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JAnnotatable;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JMethod;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;
import com.sun.xml.xsom.XSComponent;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class GeneratedRunInternalOutlineWithoutOptionsTest {

    @Test
    public void runInternalOutlineWithoutOptionsTest() throws Exception {
        Outline outline = mock(Outline.class);
        when(outline.getCodeModel()).thenReturn(new JCodeModel());
        when(outline.getClassFactory()).thenReturn((s, s1) -> new JDefinedClass(s, 0, s1));
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();

        plugin.runInternal(outline);

        verify(outline, times(1)).getCodeModel();
        verify(outline, times(1)).getClassFactory();
    }

}