package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRun_MultipleArgs_UpdatesMultipleReportsCorrectly {

    @Mock
    private Checker checker;

    @Mock
    private LocalizableReport report;

    @InjectMocks
    private EpubChecker epubChecker;

    @Test
    public void run_MultipleArgs_UpdatesMultipleReportsCorrectly() {
        String[] args = {"arg1", "arg2"};
        CheckingReport checkingReport = new DefaultReportImpl();
        epubChecker.run(args);
        assertTrue(checkingReport.getReports().get(0).contains("arg1"));
        assertTrue(checkingReport.getReports().get(0).contains("arg2"));
    }

}