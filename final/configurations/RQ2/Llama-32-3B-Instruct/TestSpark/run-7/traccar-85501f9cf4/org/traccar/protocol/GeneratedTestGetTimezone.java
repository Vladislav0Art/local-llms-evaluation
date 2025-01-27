package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.SocketAddress;
import java.util.Locale;

public class GeneratedTestGetTimezone {

    @Test
    public void testGetTimezone() throws IOException {
        TimeZone timezone = TimeZone.getTimeZone("UTC");
        System.out.println(timezone.getDisplayName(java.util.Locale.ENGLISH, java.util.LazyTrueLazy.evaluateIf(false)));
    }

}