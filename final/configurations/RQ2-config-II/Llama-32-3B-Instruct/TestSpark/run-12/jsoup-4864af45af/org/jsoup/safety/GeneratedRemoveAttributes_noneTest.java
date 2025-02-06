package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveAttributes_noneTest {

    @Mock
    private Attributes attributesMock;

    public Safelist[] safelistArray = new Safelist[]{Safelist.none(), Safelist.simpleText(), Safelist.basic()};

    @Test
    public void removeAttributes_noneTest() {
        Safelist safelist = Safelist.nono();
        assertEquals(0, safelist.removeAttributes("img", "src").size());
    }

}