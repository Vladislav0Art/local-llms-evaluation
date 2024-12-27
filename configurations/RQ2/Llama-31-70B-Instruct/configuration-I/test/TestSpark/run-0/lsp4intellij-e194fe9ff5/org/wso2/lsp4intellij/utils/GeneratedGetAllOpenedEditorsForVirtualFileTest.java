package org.wso2.lsp4intellij.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAllOpenedEditorsForVirtualFileTest {

    private Project project;
    private PsiFile psiFile;
    private VirtualFile file;
    private Editor editor;
    private Document document;

    @Test
    public void getAllOpenedEditorsForVirtualFileTest() {
        List<Editor> editors = FileUtils.getAllOpenedEditorsForVirtualFile(project, file);
        assertNotNull(editors);
    }

}