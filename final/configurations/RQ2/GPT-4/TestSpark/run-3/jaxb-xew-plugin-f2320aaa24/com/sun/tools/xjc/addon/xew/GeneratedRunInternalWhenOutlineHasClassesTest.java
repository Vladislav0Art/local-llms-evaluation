package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.addon.xew.CommonConfiguration;
import com.sun.tools.xjc.addon.xew.config.ClassConfiguration;
import com.sun.tools.xjc.outline.Outline;
import com.sun.tools.xjc.reader.Ring;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalWhenOutlineHasClassesTest {

    @InjectMocks
    private XmlElementWrapperPlugin xmlElementWrapperPlugin;

    @Mock
    private Outline outline;

    @Mock
    private ClassConfiguration classConfiguration;

    @Mock
    private CommonConfiguration commonConfiguration;

    @Mock
    private Ring ring;

    @Mock
    private JCodeModel jCodeModel;

    @Test
    public void runInternalWhenOutlineHasClassesTest() throws ClassNotFoundException, IOException {
        xmlElementWrapperPlugin.runInternal(outline);

        verify(outline, times(1)).parent();
        verifyNoMoreInteractions(outline);
    }

}