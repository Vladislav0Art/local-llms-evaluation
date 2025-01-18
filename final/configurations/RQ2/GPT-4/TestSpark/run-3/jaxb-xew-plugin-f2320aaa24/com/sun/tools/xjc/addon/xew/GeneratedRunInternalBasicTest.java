package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalBasicTest {

    @InjectMocks
    private XmlElementWrapperPlugin xmlElementWrapperPlugin;

    @Mock
    private Outline outline;

    @Test
    public void runInternalBasicTest() throws ClassNotFoundException, IOException {
        xmlElementWrapperPlugin.runInternal(outline);
        verify(outline, times(1)).getCodeModel();
    }

}