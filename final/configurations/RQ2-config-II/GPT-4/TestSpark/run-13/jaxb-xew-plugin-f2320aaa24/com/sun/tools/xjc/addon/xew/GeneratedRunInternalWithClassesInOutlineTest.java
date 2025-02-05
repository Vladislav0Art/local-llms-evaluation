package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.model.CElementPropertyInfo;
import com.sun.tools.xjc.model.CPropertyInfo;
import com.sun.tools.xjc.outline.FieldOutline;
import com.sun.tools.xjc.outline.Outline;
import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.model.CElementPropertyInfo.CollectionMode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunInternalWithClassesInOutlineTest {

    @Test
    public void runInternalWithClassesInOutlineTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline outline = Mockito.mock(Outline.class);
        ClassOutline classOutline = Mockito.mock(ClassOutline.class);
        List<ClassOutline> classOutlines = new ArrayList<>();
        classOutlines.add(classOutline);
        Mockito.when(outline.getClasses()).thenReturn(classOutlines);
        xmlElementWrapperPlugin.runInternal(outline);
        verify(outline, times(1)).getClasses();
    }

}