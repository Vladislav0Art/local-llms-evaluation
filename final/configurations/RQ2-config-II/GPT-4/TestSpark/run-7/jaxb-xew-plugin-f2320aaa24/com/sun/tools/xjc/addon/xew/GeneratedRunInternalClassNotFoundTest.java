package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.model.CPropertyInfo;
import com.sun.tools.xjc.outline.Outline;
import com.sun.tools.xjc.reader.Ring;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedRunInternalClassNotFoundTest {

    @Test
    public void runInternalClassNotFoundTest() throws Exception {
        Ring.set(CPropertyInfo.class, Mockito.mock(CPropertyInfo.class));
        Ring.set(Options.class, new Options());
        Ring.set(JCodeModel.class, new JCodeModel());
        new XmlElementWrapperPlugin().runInternal(Mockito.mock(Outline.class));
    }

}