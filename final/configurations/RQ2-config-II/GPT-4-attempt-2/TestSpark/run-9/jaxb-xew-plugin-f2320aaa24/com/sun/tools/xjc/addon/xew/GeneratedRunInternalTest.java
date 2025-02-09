package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.*;
import com.sun.tools.xjc.model.CCustomizations;
import com.sun.tools.xjc.model.CPropertyInfo;
import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.outline.Outline;
import com.sun.tools.xjc.reader.Ring;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedRunInternalTest {

    @Test
    public void runInternalTest() throws ClassNotFoundException, IOException {
        // Prepare test data
        Outline outline = mock(Outline.class);
        when(outline.getCodeModel()).thenReturn(new JCodeModel());
        when(outline.getClasses()).thenReturn(Collections.emptyList());

        Ring.add(CCustomizations.class, new CCustomizations());
        Ring.add(CPropertyInfo.class, new CPropertyInfo[0]);
        Ring.add(ClassOutline.class, new ClassOutline[0]);

        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();

        // Run the method under test
        plugin.runInternal(outline);
    }

}