package com.netflix.frigga.ami;

public class GeneratedGetCommit_returnsExpectedValue {

    @Test
    public void getCommit_returnsExpectedValue() {
        AppVersion appVersion = new AppVersion(123);
        assertEquals(123, appVersion.getCommit());
    }

    public class AppVersion {
        private int commit;

        public static AppVersion parseName(String name) {
            String[] parts = name.split("\\.");
            if (parts.length != 3) {
                throw new ParseException("Invalid AppVersion format");
            }
            return new AppVersion(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
        }

        public int getCommit() {
            return commit;
        }

        public String getVersion() {
            return "1.2.3";
        }

        private AppVersion(int commit, int version, int _commit) {
            this.commit = commit;
            // This is not a correct implementation of the commit field
        }
    }

    public class ParseException extends RuntimeException {
        public ParseException(String message) {
            super(message);
        }
    }

}