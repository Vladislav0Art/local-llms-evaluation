package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalClassNotFoundTest {

    @Mock
    private Outline outline;

    @Test
    public void runInternalClassNotFoundTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xewPlugin = new XmlElementWrapperPlugin();
        doThrow(ClassNotFoundException.class).when(outline).getClazz();
        xewPlugin.run(outline, Options.parse(null), new ErrorReceiverFilter());
    }

}