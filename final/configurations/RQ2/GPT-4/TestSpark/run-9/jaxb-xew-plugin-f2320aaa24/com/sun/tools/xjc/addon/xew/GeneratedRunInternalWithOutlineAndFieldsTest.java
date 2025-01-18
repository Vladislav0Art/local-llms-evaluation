package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.model.CPropertyInfo;
import com.sun.tools.xjc.outline.Outline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedRunInternalWithOutlineAndFieldsTest {

    @Test
    public void runInternalWithOutlineAndFieldsTest() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin xmlElementWrapperPlugin = new XmlElementWrapperPlugin();
        Outline outline = Mockito.mock(Outline.class);
        FieldOutline fieldOutline = Mockito.mock(FieldOutline.class);
        List<FieldOutline> fieldOutlines = new ArrayList<>();
        fieldOutlines.add(fieldOutline);
        Mockito.when(outline.getFields()).thenReturn(fieldOutlines);

        try {
            xmlElementWrapperPlugin.runInternal(outline);
            Mockito.verify(outline, Mockito.times(1)).getFields();
        } catch (Exception e) {
            Assert.fail("Expected exception to be thrown");
        }
    }

}