package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

public class GeneratedTestVisitBinaryExpr {

    @Test
    public void testVisitBinaryExpr() {
        Expression expr = StringIterate.create("+").withVar("x");

        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new Printer());
        int index = 0;
        while (index < expr.size()) {
            VarExpr var = (VarExpr) expr.get(index);
            if (var instanceof BinaryExpr binaryExpr) {
                AssertThat.of(binaryExpr).isExactlyOnce();

                // Expect
                index++; // Skip the name
                assertThat(() -> visitor.visitBinaryExpr(binaryExpr)).isExactlyOnce();

                // Act
                Object[] arguments = new Object[1];
                VisitorHelper helper = new VisitorHelper();
                assertThat(helper.visitAssignExpr(expr.get(index - 1)).size() == 0).isTrue();

            }
        }

        AssertThat.of(printer).isPrinted("4");
    }

    public class Printer {
        @Override
        public void print(String s) {
        }
    }

    public static class VisitorHelper extends PrettyPrintVisitor<String> {
        private int index = 0;

        @Override
        protected String visitAssignExpr(Expr expr) throws Exception {
            if (index < expr.getVar().size()) {
                String varName = expr.getVar().get(index);
                try {
                    Object value = expr.getValue();
                    return Printer.print(varName + " = " + value.toString());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            index++;
            return "";
        }

        @Override
        protected String visitBinaryExpr(Expr expr) throws Exception {
            if (index < expr.getVar().size() && index < expr.getRight().size()) {
                String left = Printer.print(expr.getLeft().toString());
                String right = Printer.print(expr.getRight().toString());

                try {
                    return Printer.print("(" + left + " " + getOperator() + " " + right + ")");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            index++;
            return "";
        }

        @Override
        protected String visitBinaryOp(Expr expr) throws Exception {
            if (index < expr.getLeft().size() && index < expr.getRight().size()) {
                String left = Printer.print(expr.getLeft().toString());
                String right = Printer.print(expr.getRight().toString());

                try {
                    return Printer.print("(" + left + " " + getOperator() + " " + right + ")");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            index++;
            return "";
        }

        @Override
        protected String visitUnaryOp(Expr expr) throws Exception {
            if (index < expr.getRight().size()) {
                String varName = expr.getLeft().toString();
                try {
                    Object value = expr.getValue();
                    return Printer.print(varName + "!" + value.toString());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            index++;
            return "";
        }
    }

    public static class Expr {
        private VarExpr var;
        private BinaryExpr binaryExpr;
        private AssignExpr assignExpr;

        public Expr(VarExpr var, BinaryExpr binaryExpr, AssignExpr assignExpr) {
            this.var = var;
            this.binaryExpr = binaryExpr;
            this.assignExpr = assignExpr;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Expr that = (Expr) o;

            if (!var.equals(that.var)) return false;
            if (binaryExpr == null ? !that.binaryExpr.equals(null) : that.binaryExpr.equals(binaryExpr)) {
                return true;
            }
            if (!assignExpr.equals(that.assignExpr)) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = var.hashCode();
            result = 31 * result + (binaryExpr != null ? binaryExpr.hashCode() : 0);
            result = 31 * result + (assignExpr != null ? assignExpr.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (var != null) sb.append(var.toString());
            else sb.append("null");
            sb.append('(').append(binaryExpr.toString()).append(')');
            if (assignExpr != null) sb.append('(').append(assignExpr.toString()).append(')');
            return sb.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Expr that = (Expr) o;

            if (!var.equals(that.var)) return false;
            if (binaryExpr == null ? !that.binaryExpr.equals(null) : that.binaryExpr.equals(binaryExpr)) {
                return true;
            }
            if (!assignExpr.equals(that.assignExpr)) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = var.hashCode();
            result = 31 * result + (binaryExpr != null ? binaryExpr.hashCode() : 0);
            result = 31 * result + (assignExpr != null ? assignExpr.hashCode() : 0);
            return result;
        }
    }

    public static void main(String[] args) {
        VarExpr var1 = new VarExpr("x", Expr.BinaryExpr.NewVariable("x"));
        VarExpr var2 = new VarExpr("y", Expr.BinaryOp.NewBinaryOperator("+"), Expr.AssignExpr.NewAssign(2, var1));

        String expr1 = "var1 + 2";
        String expr2 = "var1 * 3";

        System.out.println(new Printer().print(expr1)); // Output: x + 2
        System.out.println(new Printer().print(expr2)); // Output: x * 3
    }

}