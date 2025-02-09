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
public class GeneratedRunInternalWithTypeElementInfosTest {

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

}