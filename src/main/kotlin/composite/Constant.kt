package com.codergm.composite


class Constant(private val value: Double) : Expression {

    override fun getValue(): Double  = this.value
}