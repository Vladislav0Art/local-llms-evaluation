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
public class GeneratedRunInternalWhenClassNotFoundExceptionOccursTest {

    @Mock
    private Outline outline;

    @Test
    public void runInternalWhenClassNotFoundExceptionOccursTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        doThrow(new ClassNotFoundException("Test exception")).when(outline).getClazz2();

        xmlElementWrapperPlugin.runInternal(outline);
    }

}