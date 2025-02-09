package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.Outline;
import com.sun.tools.xjc.model.CElementPropertyInfo;
import com.sun.tools.xjc.outline.ClassOutline;

public class GeneratedTest {

    @Test
    public void runInternalTest() throws Exception {
        // given
        XmlElementWrapperPlugin testee = new XmlElementWrapperPlugin();
        Outline mockOutline = mock(Outline.class);
        ClassOutline mockClassOutline = mock(ClassOutline.class);
        when(mockOutline.getClasses()).thenReturn(Arrays.asList(mockClassOutline));
        CElementPropertyInfo mockElementPropInfo = mock(CElementPropertyInfo.class);
        when(mockClassOutline.getTarget().getProperties()).thenReturn(Arrays.asList(mockElementPropInfo));

        // when
        testee.runInternal(mockOutline);

        // then
        // Add assertions here to verify the expected results - due to the
        // class provided does not have concrete methods to verify
    }

    @Test
    public void runInternalClassNotFoundTest() throws Exception {
        // given
        XmlElementWrapperPlugin testee = new XmlElementWrapperPlugin();
        Outline mockOutline = mock(Outline.class);
        ClassOutline mockClassOutline = mock(ClassOutline.class);
        when(mockOutline.getClasses()).thenReturn(Arrays.asList(mockClassOutline));
        when(Class.forName(anyString())).thenThrow(new ClassNotFoundException());

        // when
        testee.runInternal(mockOutline);
    }

    @Test
    public void runInternalIoExceptionTest() throws Exception {
        // given
        XmlElementWrapperPlugin testee = new XmlElementWrapperPlugin();
        Outline mockOutline = mock(Outline.class);
        ClassOutline mockClassOutline = mock(ClassOutline.class);
        when(mockOutline.getClasses()).thenReturn(Arrays.asList(mockClassOutline));
        when(Class.forName(anyString())).thenThrow(new IOException());

        // when
        testee.runInternal(mockOutline);
    }

}