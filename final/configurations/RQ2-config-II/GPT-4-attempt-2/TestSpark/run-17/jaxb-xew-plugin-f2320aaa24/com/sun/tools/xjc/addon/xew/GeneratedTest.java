package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void runInternalTest() throws ClassNotFoundException, IOException {
        Outline outline = Mockito.mock(Outline.class);
        JCodeModel jCodeModel = new JCodeModel();
        JDefinedClass jDefinedClass = jCodeModel._class("OutlineTestClass");
        Mockito.when(outline.getClazz(Mockito.any())).thenReturn(new ClassOutlineStub(jDefinedClass));

        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.init(Mockito.mock(Options.class), Mockito.mock(ErrorReceiver.class));

        Exception exception = null;
        try {
            xmlElementWrapperPlugin.runInternal(outline);
        } catch (Exception ex) {
            exception = ex;
        }
        Assert.assertNull(exception);
    }
}

class ClassOutlineStub extends ClassOutline {
    JDefinedClass jDefinedClass;

    ClassOutlineStub(JDefinedClass jDefinedClass) {
        super(null, null, null);
        this.jDefinedClass = jDefinedClass;
    }

    @Override
    public JDefinedClass getImplClass() {
        return jDefinedClass;
    }

    @Override
    public ClassOutline getSuperClass() {
        return null;
    }

}