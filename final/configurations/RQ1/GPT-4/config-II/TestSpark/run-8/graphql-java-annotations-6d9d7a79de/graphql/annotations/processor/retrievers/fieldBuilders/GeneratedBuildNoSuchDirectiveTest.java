package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.Mock;

import java.lang.reflect.Method;
import java.util.Arrays;

import static org.mockito.Mockito.*;

import graphql.schema.*;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildNoSuchDirectiveTest {

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildNoSuchDirectiveTest() {
        Method m = ClassOne.class.getMethods()[0];
        DirectivesBuilder builder = new DirectivesBuilder(m, container);
        builder.build();
    }

    private static class ClassOne {
        public void methodOne() {

        }
    }

}