package com.codergm.composite

class Subtracter(left: Expression, right: Expression) : BinaryExpression(left, right) {

    override fun getValue(): Double = left.getValue() - right.getValue()
}