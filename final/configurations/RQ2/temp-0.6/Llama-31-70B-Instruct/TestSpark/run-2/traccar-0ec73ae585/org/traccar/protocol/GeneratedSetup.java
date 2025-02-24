package org.traccar.protocol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.traccar.Protocol;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedSetup {

    @Test
    public void setup() {
        @Mock
        private Protocol protocol;

        @InjectMocks
        private WatchProtocolDecoder decoder;

        @BeforeEach
        public void setup () {
            MockitoAnnotations.initMocks(this);
        }

    }