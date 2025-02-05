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
public class GeneratedRunInternalWithFieldOutlinesTest {

    @Test
    public void runInternalWithFieldOutlinesTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline outline = Mockito.mock(Outline.class);
        ClassOutline classOutline = Mockito.mock(ClassOutline.class);
        FieldOutline fieldOutline = Mockito.mock(FieldOutline.class);
        CPropertyInfo propertyInfo = Mockito.mock(CElementPropertyInfo.class);
        List<ClassOutline> classOutlines = new ArrayList<>();
        classOutlines.add(classOutline);

        Mockito.when(propertyInfo.displayName()).thenReturn("displayName");
        Mockito.when(fieldOutline.getPropertyInfo()).thenReturn(propertyInfo);
        Mockito.when(propertyInfo.parent()).thenReturn(classOutline.getTarget());
        Mockito.when(propertyInfo.collection()).thenReturn(CollectionMode.NOT_REPEATED);
        Mockito.when(classOutline.getDeclaredFields()).thenReturn(new FieldOutline[]{fieldOutline});
        Mockito.when(outline.getClasses()).thenReturn(classOutlines);
        xmlElementWrapperPlugin.runInternal(outline);
        verify(propertyInfo, times(1)).displayName();
    }

}