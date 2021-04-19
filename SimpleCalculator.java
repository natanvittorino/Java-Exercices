package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    private double additionResult;
    private double subtractionResult;
    private double multiplicationResult;
    private double divisionResult;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        double result = firstNumber + secondNumber;
        return result;
    }

    public void setAdditionResult(double additionResult) {
        this.additionResult = additionResult;
    }

    public double getSubtractionResult() {
        double result = firstNumber - secondNumber;
        return result;
    }

    public void setSubtractionResult(double subtractionResult) {
        this.subtractionResult = subtractionResult;
    }

    public double getMultiplicationResult() {
        return multiplicationResult;
    }

    public void setMultiplicationResult(double multiplicationResult) {
        this.multiplicationResult = multiplicationResult;
    }

    public double getDivisionResult() {
        return divisionResult;
    }

    public void setDivisionResult(double divisionResult) {
        this.divisionResult = divisionResult;
    }
}
