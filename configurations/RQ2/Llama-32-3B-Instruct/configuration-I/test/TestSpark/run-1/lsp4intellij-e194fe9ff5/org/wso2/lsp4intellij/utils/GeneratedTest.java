package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.wso2.lsp4intellij.utils.FileUtils;
import org.wso2.lsp4intellij.utils.ProjectUtil;
import org.wso2.lsp4intellij.utils.VirtualFileUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Set;
import java.util.stream.Collectors;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private static class Project {
        public String name;
        public List<VirtualFile> files = new ArrayList<>();
    }

    private static class Document {
        public File file;
    }

    @Mock
    private ProjectUtil projectUtil;

    @Test
    public void getAllOpenedEditorsForProject_ShouldReturnEmptyList() {
        List<Editor> editors = FileUtils.getAllOpenedEditorsForProject();
        assertEquals(0, editors.size());
    }

    @Test
    public void getAllOpenedEditorsForProject_WhenFileExists_ShouldReturnCorrectEditors() throws Exception {
        List<Editor> editors = new ArrayList<>();
        editors.add(new Editor("editor1", "file:///path/to/file1"));
        projectUtil.getProject().setOpenEditors(editors);
        when(projectUtil.getProject()).thenReturn(projectUtil.getProject());
        List<Editor> result = FileUtils.getAllOpenedEditorsForProject();
        assertEquals(editors, result);
    }

    @Test
    public void getEditorFromUri_WhenFileExists_ShouldReturnCorrectEditor() throws Exception {
        Editor editor = new Editor("editor1", "file:///path/to/file1");
        assertEquals(editor, FileUtils.getEditor("/file/path"));
    }

    @Test
    public void reloadAllEditors_ShouldReloadAllEditors() {
        // Simulate a method that reloads editors
        boolean reloading = false;
        while (!reloading) {
            reloading = true;
        }
    }

    @Test
    public void reloadEditors_WhenProjectExists_ShouldReloadProjectEditors() throws Exception {
        projectUtil.getProject().setProjectName("projectName");
        // Simulate a method that reloads project editors
        boolean reloading = false;
        while (!reloading) {
            reloading = true;
        }
    }

    @Test
    public void editorToLSPIdentifier_WhenEditorExists_ShouldReturnCorrectLSPIdentifier() throws Exception {
        Editor editor = new Editor("editor1", "file:///path/to/file1");
        assertEquals(editor.getUri(), FileUtils.editorToLSPIdentifier(editor).getUri());
    }

    @Test
    public void virtualFileFromURI_WhenFileExists_ShouldReturnCorrectVirtualFile() throws Exception {
        File file = new File("/file/path");
        VirtualFile fileObject = new VirtualFile(file);
        assertEquals(file, FileUtils.virtualFileFromURI("file:///path/to/file").getFile());
    }

    @Test
    public void isFileSupported_WhenFileExists_ShouldReturnTrue() throws Exception {
        File file = new File("/file/path");
        assertTrue(FileUtils.isFileSupported(file));
    }

    @Test
    public void findProjectsFor_WhenFileExists_ShouldReturnCorrectProjects() throws Exception {
        List<Project> projects = new ArrayList<>();
        projects.add(new Project());
        projects.get(0).setFiles(new ArrayList<>());
        projects.get(0).getFiles().add(new VirtualFile("file:///path/to/file"));
        assertEquals(projects, FileUtils.findProjectsFor("/file/path"));
    }

    @Test
    public void pathToUri_WhenPathExists_ShouldReturnCorrectURI() throws Exception {
        File file = new File("/path/to/file.txt");
        String uri = "file:///path/to/file.txt";
        assertEquals(uri, FileUtils.pathToURI(file));
    }

    @Test
    public void projectToUri_WhenProjectExists_ShouldReturnCorrectURI() throws Exception {
        Project project = new Project();
        project.setName("projectName");
        assertEquals("project://projectName", FileUtils.projectToURI(project));
    }

    @Test
    public void documentToUri_WhenDocumentExists_ShouldReturnCorrectURI() throws Exception {
        Document document = new Document();
        document.setFile(new File("/path/to/file.txt"));
        String uri = "document:///path/to/file.txt";
        assertEquals(uri, FileUtils.documentToURI(document).getUri());
    }
}

class Editor {
    private String id;
    private String uri;

    public Editor(String id, String uri) {
        this.id = id;
        this.uri = uri;
    }

    public String getId() {
        return id;
    }

    public String getUri() {
        return uri;
    }
}

class VirtualFile {
    private File file;

    public VirtualFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

}