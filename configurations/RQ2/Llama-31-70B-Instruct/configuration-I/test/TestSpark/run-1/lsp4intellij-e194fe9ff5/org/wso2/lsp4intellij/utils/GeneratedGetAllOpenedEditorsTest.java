package org.wso2.lsp4intellij.utils;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllOpenedEditorsTest {

    private Project project;
    private PsiFile psiFile;
    private VirtualFile file;
    private Editor editor;

    @Before
    public void setUp() {
        project = mock(Project.class);
        file = mock(VirtualFile.class);
    }

    @Test
    public void getAllOpenedEditorsTest() {
        List<Editor> editors = FileUtils.getAllOpenedEditors(project);
        assertNotNull(editors);
    }

}