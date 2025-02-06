package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRun_SingleArg_UpdatesReportCorrectly {

    @Mock
    private Checker checker;

    @Mock
    private LocalizableReport report;

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void run_SingleArg_UpdatesReportCorrectly() {
        String[] args = {"arg1"};
        CheckingReport checkingReport = new DefaultReportImpl();
        epubChecker.run(args);
        assertTrue(checkingReport.getReports().get(0).contains("arg1"));
    }

}