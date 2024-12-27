package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.wso2.lsp4intellij.utils.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.Document;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllOpenedEditorsForVirtualFile_ProjectNotNull_ReturnsEmptyList {

    @Mock
    private Project project;

    @Mock
    private VirtualFile virtualFile;

    @Mock
    private PsiFile psiFile;

    @Mock
    private Editor editor;

    @Mock
    private Document document;

    @InjectMocks
    private FileUtils fileUtils;

    @Test
    public void getAllOpenedEditorsForVirtualFile_ProjectNotNull_ReturnsEmptyList() {
        when(project.getOpenEditors()).thenReturn(List.of());
        List<Editor> editors = FileUtils.getAllOpenedEditorsForVirtualFile(project, virtualFile);
        assertNotNull(editors);
        assertTrue(editors.isEmpty());
    }

}