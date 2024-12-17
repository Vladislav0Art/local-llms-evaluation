package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTestEmptyTag {

    public static class BlockTag {
        private String formatAsBlock = "";
        private boolean preserveWhitespace = true;

        public void setFormatAsBlock(String formatAsBlock) {
            this.formatAsBlock = formatAsBlock;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof BlockTag)) return false;
            BlockTag other = (BlockTag) o;
            return preserveWhitespace == other.preserveWhitespace && Objects.equals(formatAsBlock, other.formatAsBlock);
        }

        @Override
        public int hashCode() {
            return Objects.hash(formatAsBlock, preserveWhitespace);
        }
    }

    public static class InlineTag {
        private String formatAsBlock = "";
        private boolean preserveWhitespace = true;

        public void setFormatAsBlock(String formatAsBlock) {
            this.formatAsBlock = formatAsBlock;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof InlineTag)) return false;
            InlineTag other = (InlineTag) o;
            return preserveWhitespace == other.preserveWhitespace && Objects.equals(formatAsBlock, other.formatAsBlock);
        }

        @Override
        public int hashCode() {
            return Objects.hash(formatAsBlock, preserveWhitespace);
        }
    }

    @Test
    public void testEmptyTag() {
        assertTrue(EmptyTag.isEmpty());
    }

}