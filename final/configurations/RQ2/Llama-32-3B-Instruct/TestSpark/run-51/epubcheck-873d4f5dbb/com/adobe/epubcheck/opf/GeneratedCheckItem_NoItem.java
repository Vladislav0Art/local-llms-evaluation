package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItem_NoItem {

    @Mock
    private ValidationContext context;

    @InjectMocks
    private OPFChecker30 subject;

    @Test
    public void checkItem_NoItem() {
        OPFItem item = mock(OFItem.class);
        subject.checkItem(item, mock(OPFHandler.class));
    }

}