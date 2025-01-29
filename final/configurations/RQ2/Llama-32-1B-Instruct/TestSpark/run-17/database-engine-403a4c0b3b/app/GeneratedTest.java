package app;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    public static class Database {
        public String selectFromTable(String[] arrSQLTerms) {
            StringBuilder builder = new StringBuilder();
            for (String sqlTerm : arrSQLTerms) {
                if (sqlTerm.startsWith("WHERE")) {
                    int openParenthesisIndex = sqlTerm.indexOf("(");
                    if (openParenthesisIndex != -1) {
                        String whereClause = sqlTerm.substring(openParenthesisIndex + 1, openParenthesisIndex + 9);
                        builder.append(" WHERE ").append(whereClause).append(";");
                    } else {
                        builder.append(sqlTerm).append(";"); // without parentheses
                    }
                } else {
                    if (arrSQLTerms.length > 0 && !arrSQLTerms[arrSQLTerms.length - 1].equals("SELECT")) {
                        throw new RuntimeException("Invalid SQL syntax");
                    }

                    String column = getFirstNonEmptyColumn(arrSQLTerms);
                    if (column == null) {
                        throw new RuntimeException("Invalid SQL syntax");
                    }

                    builder.append(sqlTerm).append("(").append(column).append(")");

                    if (arrSQLTerms.length > 0 && !arrSQLTerms[arrSQLTerms.length - 1].equals("FROM")) {
                        String[] fromColumns = getFirstNonEmptyColumns(arrSQLTerms);
                        for (String fromColumn : fromColumns) {
                            if (!fromColumn.equals(column)) {
                                builder.append(", ").append(fromColumn);
                            }
                        }
                    }

                    if (arrSQLTerms.length > 0 && !arrSQLTerms[arrSQLTerms.length - 1].equals("WHERE")) {
                        String[] whereClauses = getFirstNonEmptyColumns(arrSQLTerms);
                        for (String whereClause : whereClauses) {
                            if (!whereClause.equals("")) {
                                builder.append(", ").append(whereClause).append(";"); // without open parenthesis
                            }
                        }

                        builder.setLength(builder.length() - 1); // remove last comma and semicolon

                        return builder.toString();
                    } else {
                        return sqlTerm;
                    }
                }
            }

            return "";
        }

        public String getFirstNonEmptyColumn(String[] arrSQLTerms) {
            for (String sqlTerm : arrSQLTerms) {
                if (!sqlTerm.isEmpty()) {
                    return sqlTerm;
                }
            }

            return null;
        }

        public static class SQLTerm {
            private String sqlTerm;
            private boolean isWhere;

            public SQLTerm(String sqlTerm, boolean isWhere) {
                this.sqlTerm = sqlTerm;
                this.isWhere = isWhere;
            }

            @Override
            public String toString() {
                return sqlTerm + (isWhere ? " WHERE" : "") + getFirstNonEmptyColumn(arrSQLTerms);
            }
        }

    }