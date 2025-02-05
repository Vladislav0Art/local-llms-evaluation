package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.model.CElementPropertyInfo;
import com.sun.tools.xjc.model.CPropertyInfo;
import com.sun.tools.xjc.outline.FieldOutline;
import com.sun.tools.xjc.outline.Outline;
import com.sun.xml.xsom.XSComponent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.xml.namespace.QName;
import java.util.Collection;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Outline outlineMock;

    @Mock
    private JCodeModel jCodeModelMock;

    @Mock
    private CElementPropertyInfo cElementPropertyInfoMock;

    @Mock
    private XSComponent xSComponentMock;

    @Mock
    private FieldOutline fieldOutlineMock;

    @Mock
    private Collection collectionMock;

    @Test
    public void runInternalTest() throws Exception {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(outlineMock);
    }

    @Test
    public void getCollectionComponentTest() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Class clazz = plugin.getCollectionComponent(fieldOutlineMock);
    }

    @Test
    public void generateWrappedElementTest() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        QName qName = new QName("local");
        Class clazz = plugin.getCollectionComponent(fieldOutlineMock);
        plugin.generateWrappedElement(qName, clazz, jCodeModelMock, cElementPropertyInfoMock, outlineMock);
    }

    @Test
    public void replaceFieldTest() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        QName qName = new QName("local");
        Class clazz = plugin.getCollectionComponent(fieldOutlineMock);
        CPropertyInfo cPropertyInfo = mock(CPropertyInfo.class);
        plugin.replaceField(clazz, fieldOutlineMock, qName, cElementPropertyInfoMock, cPropertyInfo);
    }

    @Test
    public void processTest() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.process(outlineMock, cElementPropertyInfoMock, collectionMock, xSComponentMock);
    }

}