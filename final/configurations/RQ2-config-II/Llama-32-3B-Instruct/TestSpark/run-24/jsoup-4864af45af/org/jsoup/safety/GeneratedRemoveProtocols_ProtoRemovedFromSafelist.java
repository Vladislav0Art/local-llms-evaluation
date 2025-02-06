package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRemoveProtocols_ProtoRemovedFromSafelist {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void removeProtocols_ProtoRemovedFromSafelist() {
        Set<String> expectedProtocols = new HashSet<>();
        expectedProtocols.add("proto1");
        expectedProtocols.add("proto2");
        Safelist safelist = Safelist.removeProtocols("tag", "attribute", expectedProtocols);
        Mockito.verify(safelist).removeProtocols(Mockito.anyString(), Mockito.anyString(), Mockito.anySet());
    }

}