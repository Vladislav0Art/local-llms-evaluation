package io.github.vmzakharov.ecdataframe.dsl.visitor;

import io.github.vmzakharov.ecdataframe.dsl.*;
import io.github.vmzakharov.ecdataframe.dsl.value.*;
import io.github.vmzakharov.ecdataframe.dsl.visitor.*;
import io.github.vmzakharov.ecdataframe.util.CollectingPrinter;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.utility.StringIterate;
import org.eclipse.collections.impl.utility.ArrayIterate;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEscapeVarNameIfNeededTest {

    @Test
    public void EscapeVarNameIfNeededTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        Assert.assertEquals("abc", visitor.escapeVarNameIfNeeded("abc", false));
        Assert.assertEquals("${abc}", visitor.escapeVarNameIfNeeded("abc", true));
    }

}