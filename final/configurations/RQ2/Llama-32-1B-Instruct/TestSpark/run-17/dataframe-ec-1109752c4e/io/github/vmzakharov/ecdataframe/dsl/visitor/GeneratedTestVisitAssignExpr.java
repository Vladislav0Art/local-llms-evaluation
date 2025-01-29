package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

public class GeneratedTestVisitAssignExpr {

    @Test
    public void testVisitAssignExpr() {
        Expression expr = StringIterate.create("x").withVar("y");
        PrettyPrintVisitor visitor = new PrettyPrintVisitor(new Printer());
        int index = 0;
        while (index < expr.size()) {
            VarExpr var = (VarExpr) expr.get(index);
            if (var instanceof AssignExpr assignExpr) {
                AssertThat.of(assignExpr).isExactlyOnce();

                // Expect
                index++; // Skip the name
                assertThat(() -> visitor.visitAssignExpr(assignExpr)).isExactlyOnce();

                // Act
                Object[] arguments = new Object[1];
                VisitorHelper helper = new VisitorHelper();
                assertThat(helper.visitBinaryExpr(expr.get(index - 1)).size() == 0).isTrue();

            }
        }

        AssertThat.of(printer).isPrinted("y");
    }

}