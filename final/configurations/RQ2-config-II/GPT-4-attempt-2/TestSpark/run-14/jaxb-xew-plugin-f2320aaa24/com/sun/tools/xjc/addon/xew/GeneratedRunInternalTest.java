package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JAnonymousClass;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JPackage;
import com.sun.tools.xjc.model.CElementPropertyInfo;
import com.sun.tools.xjc.model.CPropertyInfo;
import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.outline.FieldOutline;
import com.sun.tools.xjc.outline.Outline;
import com.sun.xml.xsom.XSComponent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import java.io.IOException;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(PowerMockRunner.class)
public class GeneratedRunInternalTest {

    ClassOutline .class,FieldOutline .class,Outline .class
})

public class XmlElementWrapperPluginTest {

    @Mock
    private Outline outline;

    @Mock
    private ClassOutline classOutline;

    @Mock
    private FieldOutline fieldOutline;

    @Mock
    private CPropertyInfo cPropertyInfo;

    @Mock
    private CElementPropertyInfo cElementPropertyInfo;

    @Mock
    private XSComponent xsComponent;

    @Mock
    private JCodeModel jCodeModel;

    @Mock
    private JAnonymousClass jAnonymousClass;

    @Mock
    private JPackage jPackage;

    @Mock
    private JClass jClass;

    @Test
    public void runInternalTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();

        Whitebox.setInternalState(xmlElementWrapperPlugin, "outline", outline);
        Whitebox.setInternalState(xmlElementWrapperPlugin, "classOutline", classOutline);
        Whitebox.setInternalState(xmlElementWrapperPlugin, "fieldOutline", fieldOutline);
        Whitebox.setInternalState(xmlElementWrapperPlugin, "cPropertyInfo", cPropertyInfo);
        Whitebox.setInternalState(xmlElementWrapperPlugin, "cElementPropertyInfo", cElementPropertyInfo);
        Whitebox.setInternalState(xmlElementWrapperPlugin, "xsComponent", xsComponent);
        Whitebox.setInternalState(xmlElementWrapperPlugin, "jCodeModel", jCodeModel);
        Whitebox.setInternalState(xmlElementWrapperPlugin, "jAnonymousClass", jAnonymousClass);
        Whitebox.setInternalState(xmlElementWrapperPlugin, "jPackage", jPackage);
        Whitebox.setInternalState(xmlElementWrapperPlugin, "jClass", jClass);

        xmlElementWrapperPlugin.runInternal(outline);

        verify(outline).getCodeModel();
        verify(jCodeModel).anonymousClass(JAXBElement.class);
        verify(cElementPropertyInfo).getSchemaComponent();
        verify(cElementPropertyInfo).ref();
        verify(jCodeModel).ref(JAXBElement.class);
        verify(cElementPropertyInfo).getName(false);
        verify(jCodeModel).ref(JAXBElement.class);
        verify(jCodeModel).ref(JAXBElement.class);
    }

}