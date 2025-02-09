package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JClassContainer;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.outline.Outline;
import com.sun.tools.xjc.outline.PackageOutline;
import com.sun.tools.xjc.reader.Ring;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

import static org.mockito.Mockito.*;

public class GeneratedRunInternalThrowClassNotFoundExceptionTest {

    @Test
    public void runInternalThrowClassNotFoundExceptionTest() throws Exception {
        Outline outline = mock(Outline.class);
        when(outline.getClasses()).thenThrow(ClassNotFoundException.class);

        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(outline);
    }

}