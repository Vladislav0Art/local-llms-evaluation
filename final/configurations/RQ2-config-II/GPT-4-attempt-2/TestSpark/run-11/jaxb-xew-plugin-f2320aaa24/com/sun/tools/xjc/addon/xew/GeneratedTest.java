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

public class GeneratedTest {

    @Test
    public void runInternalTest() throws Exception {
        // Prepare test data
        JCodeModel codeModel = new JCodeModel();
        JDefinedClass definedClass = codeModel._class("Test");
        ClassOutline classOutline = new ClassOutline() {
            public JDefinedClass implClass() {
                return definedClass;
            }

            public JClassContainer parentContainer() {
                return definedClass.parentContainer();
            }

            public Outline parent() {
                return null;
            }

            public JDefinedClass ref() {
                return definedClass;
            }

            public PackageOutline _package() {
                return null;
            }
        };

        Outline outline = mock(Outline.class);
        when(outline.getClasses()).thenReturn(Collections.singletonList(classOutline));

        // Create instance and invoke method
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(outline);

        // Verify that methods were called correctly
        verify(outline).getClasses();
    }

    @Test
    public void runInternalThrowIOExceptionTest() throws Exception {
        Outline outline = mock(Outline.class);
        when(outline.getClasses()).thenThrow(IOException.class);

        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(outline);
    }

    @Test
    public void runInternalThrowClassNotFoundExceptionTest() throws Exception {
        Outline outline = mock(Outline.class);
        when(outline.getClasses()).thenThrow(ClassNotFoundException.class);

        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(outline);
    }

}