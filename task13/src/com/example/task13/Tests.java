package com.example.task13;

import codecheck.CodeParser;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Tests {


    private void check(char input, char output) {
        Assertions.assertThat(Task13.toUpperCase(input)).as("Input: \"%s\"", input).isEqualTo(output);
    }

    @Test
    public void test() throws Exception {
        check('a', 'A');
        check('q', 'Q');
        check('r', 'R');
        check('g', 'G');
        check('n', 'N');
        check('u', 'U');
    }


    @Test
    public void testContent() throws Exception {
        MethodDeclaration method = new CodeParser("task13", Task13.class).findSingleMethod("toUpperCase");

        if (method.findAll(MethodCallExpr.class).size() > 0) {
            Assertions.fail("Стандартные функции (например Character.toUpperCase) в этом задании использовать запрещено");
        }
    }
}
