package com.company;
//реализация фабрики
public class ConcreateFactory implements ComplexAbstractFactory{
    public int real = 6;
    public int image = 5;
    @Override
    public Complex createComplex(){
        return new Complex();
    }
    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex(real, image);
    }
}

