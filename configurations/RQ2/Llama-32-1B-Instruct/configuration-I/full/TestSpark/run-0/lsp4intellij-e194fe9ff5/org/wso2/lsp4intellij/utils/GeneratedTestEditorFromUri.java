package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

public class GeneratedTestEditorFromUri {

    @Mock
    private Project project;

    @Mock
    private Editor editorFromPsiFile;

    @Mock
    private PsiFile psiFile;

    @Mock
    private VirtualFile virtualFile;

    public void testGetAllOpenedEditors() {
        List<Editor> editors = new ArrayList<>();
        editors.add(editorFromPsiFile(psiFile));
        when(editorFromPsiFile(any(PsiFile.class))).thenReturn(editorFromPsiFile);
        assertEquals(1, FileUtils.getAllOpenedEditors(project).size());
        verify(editorFromPsiFile).from(psiFile);
    }

    public void testGetAllOpenedEditorsForUri() {
        List<Editor> editors = new ArrayList<>();
        editors.add(editorFromUri("uri", project));
        when(editorFromUri(any(String.class), any(Project.class))).thenReturn(editorFromUri);
        assertEquals(1, FileUtils.getAllOpenedEditorsForUri(project, "uri").size());
    }

    public void testGetAllOpenedEditorsForVirtualFile() {
        List<Editor> editors = new ArrayList<>();
        editors.add(editorFromVirtualFile(virtualFile, project));
        when(editorFromVirtualFile(any(VirtualFile.class), any(Project.class))).thenReturn(editorFromVirtualFile);
        assertEquals(1, FileUtils.getAllOpenedEditorsForVirtualFile(project, virtualFile).size());
    }

    public void testReloadAllEditors() {
        FileUtils.reloadAllEditors();
        verify(project).restart();
    }

    public void testReloadEditors() {
        Project project = new Project();
        project.setActiveEditor(editorFromPsiFile(psiFile));
        FileUtils.reloadEditors(project);
        verify(project).restart();
        Mockito.verifyNoMoreInteractions(project, editorFromPsiFile.class);
    }

    @Test
    public void testEditorFromUri() {
        Editor editor = FileUtils.editorFromUri("uri", project);
        assertEquals(editor, editorFromUri);
    }

}