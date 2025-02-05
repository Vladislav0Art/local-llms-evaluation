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
public class GeneratedGenerateWrappedElementTest {

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
    public void generateWrappedElementTest() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        QName qName = new QName("local");
        Class clazz = plugin.getCollectionComponent(fieldOutlineMock);
        plugin.generateWrappedElement(qName, clazz, jCodeModelMock, cElementPropertyInfoMock, outlineMock);
    }

}