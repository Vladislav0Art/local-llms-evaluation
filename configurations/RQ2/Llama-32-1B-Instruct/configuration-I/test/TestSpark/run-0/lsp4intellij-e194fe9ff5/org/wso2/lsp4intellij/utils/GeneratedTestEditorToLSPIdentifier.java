package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestEditorToLSPIdentifier {

    public static List<Editor> getAllOpenedEditors(Project project) {
        return testGetAllOpenedEditors(project);
    }

    public static List<Editor> getAllOpenedEditorsForUri(Project project, String uri) {
        return testGetAllOpenedEditors(project, uri);
    }

    public static List<Editor> getAllOpenedEditorsForVirtualFile(Project project, VirtualFile file) {
        return testGetAllOpenedEditors(project, file);
    }

    public static void reloadAllEditors() {
        return testReloadAllEditors();
    }

    public static void reloadEditors(@NotNull Project project) {
        return testReloadEditors(project);
    }

    public static Editor editorFromPsiFile(PsiFile psiFile) {
        return testEditorFromPsiFile(psiFile);
    }

    public static Editor editorFromUri(String uri, Project project) {
        return testEditorFromUri(uri, project);
    }

    @Nullable
    public static Editor editorFromVirtualFile(VirtualFile file, Project project) {
        return testEditorFromVirtualFile(file, project);
    }

    public static VirtualFile virtualFileFromURI(String uri) {
        return testVirtualFileFromURI(uri);
    }

    public static FileType fileTypeFromEditor(Editor editor) {
        return testFileTypeFromEditor(editor);
    }

    public static TextDocumentIdentifier editorToLSPIdentifier(Editor editor) {
        return testEditorToLSPIdentifier(editor);
    }

    public static String editorToURIString(Editor editor) {
        return testEditorToURIString(editor);
    }

    public static VirtualFile virtualFileFromEditor(Editor editor) {
        return testVirtualFileFromEditor(editor);
    }

    public static String VFSToURI(VirtualFile file) {
        return testVfstoURI(file);
    }

    public static String sanitizeURI(String uri) {
        return testSanitizeURI(uri);
    }

    public static VirtualFile URIToVFS(String uri) {
        return testURIToVFS(uri);
    }

    public static String editorToProjectFolderUri(Editor editor) {
        return testEditorToProjectFolderUri(editor);
    }

    public static String editorToProjectFolderPath(Editor editor) {
        return testEditorToProjectFolderPath(editor);
    }

    public static String pathToUri(@Nullable String path) {
        return testPathToURI(path);
    }

    public static String projectToUri(Project project) {
        return testProjectToURI(project);
    }

    public static Document documentToURI(Document document) {
        return testDocumentToURI(document);
    }

    public static boolean isFileSupported(@Nullable VirtualFile file) {
        return testIsFileSupported(file);
    }

    @NotNull
    public static Set<Project> findProjectsFor(@NotNull VirtualFile file) {
        return testFindProjectsFor(file);
    }

    public static PsiFile[] searchFiles(String fileName, Project p) {
        return testSearchFiles(fileName, p);
    }

    public static boolean isEditorSupported(@NotNull Editor editor) {
        return testIsEditorSupported(editor);
    }
}

public class FileUtilsImpl implements FileUtils {

    @Override
    public List<Editor> getAllOpenedEditors(Project project) {
        // implementation
    }

    @Override
    public List<Editor> getAllOpenedEditorsForUri(Project project, String uri) {
        // implementation
    }

    @Override
    public List<Editor> getAllOpenedEditorsForVirtualFile(Project project, VirtualFile file) {
        // implementation
    }

    @Override
    public void reloadAllEditors() {
        // implementation
    }

    @Override
    public void reloadEditors(@NotNull Project project) {
        // implementation
    }

    @Override
    public Editor editorFromPsiFile(PsiFile psiFile) {
        // implementation
    }

    @Override
    public Editor editorFromUri(String uri, Project project) {
        // implementation
    }

    @Nullable
    @Override
    public Editor editorFromVirtualFile(VirtualFile file, Project project) {
        // implementation
    }

    public VirtualFile virtualFileFromURI(String uri) {
        // implementation
    }

    public FileType fileTypeFromEditor(Editor editor) {
        // implementation
    }

    public TextDocumentIdentifier editorToLSPIdentifier(Editor editor) {
        // implementation
    }

    public String editorToURIString(Editor editor) {
        // implementation
    }

    public VirtualFile virtualFileFromEditor(Editor editor) {
        // implementation
    }

    public String VFSToURI(VirtualFile file) {
        // implementation
    }

    public String sanitizeURI(String uri) {
        // implementation
    }

    public VirtualFile URIToVFS(String uri) {
        // implementation
    }

    public String editorToProjectFolderUri(Editor editor) {
        // implementation
    }

    public String editorToProjectFolderPath(Editor editor) {
        // implementation
    }

    public String pathToURI(@Nullable String path) {
        // implementation
    }

    public String projectToURI(Project project) {
        // implementation
    }

    public Document documentToURI(Document document) {
        // implementation
    }

    public boolean isFileSupported(@Nullable VirtualFile file) {
        // implementation
    }

    @NotNull
    @Override
    public Set<Project> findProjectsFor(@NotNull VirtualFile file) {
        // implementation
    }

    public PsiFile[] searchFiles(String fileName, Project p) {
        // implementation
    }

    public boolean isEditorSupported(@NotNull Editor editor) {
        // implementation
    }
}

public class EditorToLSPIdentifierTest {

    @Test
    public void testEditorToLSPIdentifier() {
        Editor editor = FileUtilsImpl.editorFromPsiFile(new PsiFile());
        FileType fileType = FileUtilsImpl.fileTypeFromEditor(editor);
        TextDocumentIdentifier identifier = FileUtilsImpl.editorToLSPIdentifier(editor);
        assertEquals(fileType, identifier);
    }

}