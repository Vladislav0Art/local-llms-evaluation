package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;

import static org.mockito.Mockito.doThrow;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalWhenIOExceptionOccursTest {

    @Mock
    private Outline outline;

    @Test
    public void runInternalWhenIOExceptionOccursTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        doThrow(new IOException("Test exception")).when(outline).getClazz2();

        xmlElementWrapperPlugin.runInternal(outline);
    }

}