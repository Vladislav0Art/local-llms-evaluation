package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEditorFromUriTest {

    @Mock
    private Project project;

    @Mock
    private PsiFile psiFile;

    @Mock
    private VirtualFile file;

    @Mock
    private Editor editor;

    @Mock
    private Document document;

    @Test
    public void editorFromUriTest() {
        Editor editor = FileUtils.editorFromUri("uri", project);
        assertNotNull(editor);
    }

}