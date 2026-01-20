package com.codergm.composite

class Adder(left: Expression, right: Expression) : BinaryExpression(left, right) {

    override fun getValue(): Double = left.getValue() + right.getValue()
}