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
public class GeneratedRunInternalNoExceptionTest {

    @Mock
    private Outline outline;

    @Test
    public void runInternalNoExceptionTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xewPlugin = new XmlElementWrapperPlugin();
        xewPlugin.run(outline, Options.parse(null), new ErrorReceiverFilter());
        verify(outline).getClazz(); // verifies getClazz was called on "outline" mock
    }

}