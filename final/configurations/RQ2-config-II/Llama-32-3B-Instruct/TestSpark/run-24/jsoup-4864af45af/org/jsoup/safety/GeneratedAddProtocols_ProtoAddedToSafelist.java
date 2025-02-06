package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddProtocols_ProtoAddedToSafelist {

    @Mock
    private Iterator<String> tagsIterator;

    @Test
    public void addProtocols_ProtoAddedToSafelist() {
        Set<String> expectedProtocols = new HashSet<>();
        expectedProtocols.add("proto1");
        expectedProtocols.add("proto2");
        Safelist safelist = Safelist.addProtocols("tag", "attribute", expectedProtocols);
        Mockito.verify(safelist).addProtocols(Mockito.anyString(), Mockito.anyString(), Mockito.anySet());
    }

}