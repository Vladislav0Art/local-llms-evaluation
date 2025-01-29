package com.force.i18n.grammar.impl;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestWriteJsonWithEmptyInputStream {

    @Test
    public void testWriteJsonWithEmptyInputStream() {
        Map<String, Object> map = new HashMap<>();
        when(map.get("term1")).thenReturn(null);

        try (ObjectOutputStream out = new ObjectOutputStream(mock(InputStream.class))) {
            writeJson(out, null, null, Collections.emptySet());
        }
    }

    private void writeJson(ObjectOutputStream out, Object... args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            map.put("term" + i, args[i]);
        }
        when(map.get("term1")).thenReturn(args[0]);
        out.writeObject(map);
    }

    private void writeJson(InputStream in, Object... args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            map.put("term" + i, args[i]);
        }
        when(map.get("term1")).thenReturn(args[0]);
        in.writeObject(map);
    }

    private void writeJson(InputStream in, Object... args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            map.put("term" + i, args[i]);
        }
        when(map.get("term1")).thenReturn(args[0]);
        in.writeUTF((String) map.get("term1"));
    }

    private void writeJson(InputStream in, Object... args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            map.put("term" + i, args[i]);
        }
        when(map.get("term1")).thenReturn(args[0]);
        in.writeUTF((String) map.get("term1"));
    }

    private void writeJson(InputStream in, String... args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            map.put("term" + i, args[i]);
        }
        when(map.get("term1")).thenReturn(args[0]);
        in.writeUTF((String) map.get("term1"));
    }

    private void writeJson(InputStream in, Object... args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            map.put("term" + i, args[i]);
        }
        when(map.get("term1")).thenReturn(args[0]);
        in.writeUTF((String) map.get("term1"));
    }

    private void writeJson(Object... args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            map.put("term" + i, args[i]);
        }
        when(map.get("term1")).thenReturn(args[0]);
        writeJson(mock(InputStream.class), args);
    }

    private void writeJson(Object... args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            map.put("term" + i, args[i]);
        }
        when(map.get("term1")).thenReturn(args[0]);
    }

    private void writeJson(InputStream in) throws Exception {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("term" + i, null);
        }
        when(map.get("term1")).thenReturn(null);
        in.writeUTF((String) map.get("term1"));
    }

    private void writeJson(Object... args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            map.put("term" + i, null);
        }
        when(map.get("term1")).thenReturn(null);
    }

    private void writeJson(InputStream in) throws Exception {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("term" + i, null);
        }
        when(map.get("term1")).thenReturn(null);
        in.writeUTF((String) map.get("term1"));
    }

    private void writeJson(Object... args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("term" + i, null);
        }
        when(map.get("term1")).thenReturn(null);
    }

}