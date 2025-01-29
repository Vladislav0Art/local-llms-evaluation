package app;

import org.junit.jupiter.api.Test;

public class GeneratedTestWhere {

    public static class Database {
        public String selectFromTable(String[] arrSQLTerms) {
            StringBuilder builder = new StringBuilder();
            for (String sqlTerm : arrSQLTerms) {
                if (sqlTerm.equals("SELECT")) {
                    builder.append(sqlTerm).append(" *").append("\n");
                } else if (sqlTerm.startsWith("WHERE") && !arrSQLTerms.length == 0) {
                    String whereClause = getWhereClause(arrSQLTerms);
                    for (String operator : getOperators()) {
                        switch (operator) {
                            case "IS NULL":
                                builder.append(sqlTerm).append(" ").append(whereClause).append("").append("\n");
                                break;
                            case "IS NOT NULL":
                                builder.append(sqlTerm).append(" ").append(whereClause).append(" IS NOT ").append(operator).append("\n");
                                break;
                            default:
                                throw new RuntimeException("Unsupported operator: " + operator);
                        }
                    }
                } else {
                    String column = getOperator(arrSQLTerms[0]);
                    builder.append(sqlTerm).append("(").append(column).append(")").append("\n");
                }
            }
            return builder.toString();
        }

        public String selectFromTable(String[] arrSQLTerms, String... strarrOperators) {
            StringBuilder builder = new StringBuilder();
            for (String sqlTerm : arrSQLTerms) {
                if (sqlTerm.equals("SELECT")) {
                    builder.append(sqlTerm).append(" *").append("\n");
                } else if (sqlTerm.startsWith("WHERE") && !strarrOperators.length == 0) {
                    String whereClause = getWhereClause(arrSQLTerms);
                    for (String operator : strarrOperators) {
                        switch (operator) {
                            case "IS NULL":
                                builder.append(sqlTerm).append(" ").append(whereClause).append("").append("\n");
                                break;
                            case "IS NOT NULL":
                                builder.append(sqlTerm).append(" ").append(whereClause).append(" IS NOT ").append(operator).append("\n");
                                break;
                            default:
                                throw new RuntimeException("Unsupported operator: " + operator);
                        }
                    }
                } else {
                    String column = getOperator(arrSQLTerms[0]);
                    builder.append(sqlTerm).append("(").append(column).append(")").append("\n");
                }
            }
            return builder.toString();
        }

        public String getWhereClause(String[] arrSQLTerms) {
            if (arrSQLTerms.length == 1 && arrSQLTerms[0].equals("WHERE")) {
                return " WHERE ";
            } else {
                return "";
            }
        }

        public String getOperator(String sqlTerm) {
            switch (sqlTerm.substring(0, 4)) {
                case "IS":
                    return "IS";
                case "NOT":
                    return "IS NOT";
                default:
                    throw new RuntimeException("Unsupported operator: " + sqlTerm);
            }
        }
    }

    @Test
    public void testWhere() {
        String[] arrSQLTerms = new SQLTerm[]{"WHERE column1 IS NULL", "column2 IS NOT NULL"};
        System.out.println(Database.selectFromTable(arrSQLTerms, "strarrOperators"));
    }

}