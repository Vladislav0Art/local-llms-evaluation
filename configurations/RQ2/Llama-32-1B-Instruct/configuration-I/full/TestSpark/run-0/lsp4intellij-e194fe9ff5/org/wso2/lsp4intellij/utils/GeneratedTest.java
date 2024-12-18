package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

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
    public void testEditorFromPsiFile() {
        Editor editor = FileUtils.editorFromPsiFile(psiFile);
        assertEquals(editor, editorFromPsiFile);
    }

    @Test
    public void testEditorFromUri() {
        Editor editor = FileUtils.editorFromUri("uri", project);
        assertEquals(editor, editorFromUri);
    }

    @Test
    public void testEditorFromVirtualFile() {
        VirtualFile file = new VirtualFile();
        file.setId(1L);
        when(virtualFileFromURI(any(String.class))).thenReturn(file);
        Editor editor = FileUtils.editorFromVirtualFile(file, project);
        assertEquals(editor, editorFromVirtualFile);
    }

    @Test
    public void testFileTypeFromEditor() {
        Editor editor = new Editor();
        editor.setId(1L);
        FileType fileType = FileUtils.fileTypeFromEditor(editor);
        assertEquals(TypeFile.EDITOR, fileType);
    }

    @Test
    public void testTextDocumentIdentifierFromEditor() {
        Editor editor = new Editor();
        editor.setId(1L);
        TextDocumentIdentifier identifier = FileUtils.editorToLSPIdentifier(editor);
        assertEquals(TextDocumentIdentifier.TextDocumentIdentifierType.DOCUMENT, identifier);
    }

    @Test
    public void testEditorToString() {
        Editor editor = new Editor();
        editor.setId(1L);
        String uri = "uri";
        String result = FileUtils.editorToString(editor, uri);
        assertEquals("uri", result);
    }

    public class Project {
        private Long id;

        public Project() {
        }

        public Long getId() {
            return id;
        }
    }

    public static class Editor {
        private Long id;

        public Editor() {
        }

        public Long getId() {
            return id;
        }
    }

    public static class File {
        private String id;

        public File() {
        }

        public String getId() {
            return id;
        }
    }

    public static class FileType {
        private FileTypeType type;

        public FileType() {
        }

        public FileTypeType getType() {
            return type;
        }
    }

    public static class TextDocumentIdentifier {
        private TextDocumentIdentifierType type;

        public TextDocumentIdentifier() {
        }

        public TextDocumentIdentifierType getType() {
            return type;
        }
    }

    public enum FileTypeType {
        EDITOR, TEXT
    }

}