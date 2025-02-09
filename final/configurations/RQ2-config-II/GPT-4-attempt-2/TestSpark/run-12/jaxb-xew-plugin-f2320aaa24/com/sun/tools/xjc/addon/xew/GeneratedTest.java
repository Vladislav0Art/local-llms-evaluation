package com.sun.tools.xjc.addon.xew;

import com.sun.codemodel.*;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.model.CPropertyInfo;
import com.sun.tools.xjc.outline.FieldOutline;
import com.sun.tools.xjc.outline.Outline;
import com.sun.tools.xjc.reader.Ring;
import com.sun.xml.xsom.XSComponent;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.ObjectUtils;
import org.glassfish.jaxb.core.api.impl.NameConverter;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Collection;
import java.util.Map;
import javax.xml.namespace.QName;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void runInternalIOExceptionTest() throws ClassNotFoundException, IOException {
        Outline outline = Mockito.mock(Outline.class);
        when(outline.getCodeModel()).thenThrow(new IOException());
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(outline);
    }

    @Test
    public void runInternalClassNotFoundExceptionTest() throws ClassNotFoundException, IOException {
        Outline outline = Mockito.mock(Outline.class);
        when(outline.getClazz(any())).thenThrow(new ClassNotFoundException());
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(outline);
    }

    @Test
    public void runInternalSucceedsTest() throws ClassNotFoundException, IOException {
        Outline outline = Mockito.mock(Outline.class);
        when(outline.getCodeModel()).thenReturn(new JCodeModel());
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        plugin.runInternal(outline);
        verify(outline).getCodeModel();
    }

}