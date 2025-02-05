package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.model.CPropertyInfo;
import com.sun.tools.xjc.outline.Outline;
import com.sun.tools.xjc.reader.Ring;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedRunInternalIoExceptionTest {

    @Test
    public void runInternalIoExceptionTest() throws Exception {
        Ring.set(Options.class, new Options());
        new XmlElementWrapperPlugin().runInternal(Mockito.mock(Outline.class));
    }

}