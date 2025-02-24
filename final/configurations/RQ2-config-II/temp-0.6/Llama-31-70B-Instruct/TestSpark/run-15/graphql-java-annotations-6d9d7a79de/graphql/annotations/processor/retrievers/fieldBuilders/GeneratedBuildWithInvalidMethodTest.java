package graphql.annotations.processor.retrievers.fieldBuilders;

import static org.junit.Assert.assertEquals;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import org.junit.Test;

public class GeneratedBuildWithInvalidMethodTest {

    @Test
    public void buildWithInvalidMethodTest() throws Exception {
        Method method = DirectivesBuilder.class.getDeclaredMethod("build");
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(method, null);

        directivesBuilder.build();
    }

}