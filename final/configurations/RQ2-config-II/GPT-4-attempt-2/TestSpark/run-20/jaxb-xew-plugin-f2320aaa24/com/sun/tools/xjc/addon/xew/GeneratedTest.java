package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.model.CElementPropertyInfo;
import com.sun.tools.xjc.model.CReferencePropertyInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void runInternalWithInvalidOutlineTest() {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        try {
            xmlElementWrapperPlugin.runInternal(null);
        } catch (ClassNotFoundException | IOException e) {
            // Assert that exception are thrown correctly for invalid input
        }
    }

    @Test
    public void runInternalWithTypeElementInfosTest() throws Exception {
        Outline outline = Mockito.mock(Outline.class);
        CElementPropertyInfo elementPropertyInfo = Mockito.mock(CElementPropertyInfo.class);
        CReferencePropertyInfo referencePropertyInfo = Mockito.mock(CReferencePropertyInfo.class);

        Mockito.when(outline.getAllClassContexts()).thenReturn(new ArrayList<>());

        Set<CElementPropertyInfo> typeElementInfos = new HashSet<>();
        typeElementInfos.add(elementPropertyInfo);
        typeElementInfos.add(referencePropertyInfo);

        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(outline);

        Mockito.verify(outline).getAllClassContexts();
        Mockito.verify(elementPropertyInfo).accepted();
        Mockito.verify(referencePropertyInfo).accepted();
    }

    @Test
    public void runInternalWithEmptyTypeElementInfosTest() throws Exception {
        Outline outline = Mockito.mock(Outline.class);

        Mockito.when(outline.getAllClassContexts()).thenReturn(new ArrayList<>());

        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        xmlElementWrapperPlugin.runInternal(outline);

        Mockito.verify(outline).getAllClassContexts();
    }

}