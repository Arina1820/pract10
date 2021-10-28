package com.company;
//сама абстрактная фабрика
public interface ComplexAbstractFactory{
    public Complex createComplex();
    public Complex CreateComplex(int real, int image);
}
