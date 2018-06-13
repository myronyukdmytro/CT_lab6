package dmyroniuk.lab6.model;

public class Calculator {

    private String operation;
    private float oper1;
    private float oper2;
    private float result;

    public Calculator(String operation, float oper1,float oper2){
        this.operation = operation;
        this.oper1 = oper1;
        this.oper2 = oper2;
        if (this.operation.equals("plus"))
            this.result = add(oper1,oper2);
        else  if (this.operation.equals("minus"))
            this.result = subtract(oper1,oper2);
        else if (this.operation.equals("multiplication"))
            this.result = multiply(oper1,oper2);
        else if (this.operation.equals("division"))
            this.result = divide(oper1,oper2);
    }


    private float add (float oper1,float oper2)
    {
        return oper1+oper2;
    }
    private float subtract(float oper1,float oper2)
    {
        return oper1-oper2;
    }
    private float multiply(float oper1,float oper2)
    {
        return oper1*oper2;
    }
    private float divide(float oper1,float oper2)
    {
        return oper1/oper2;
    }


    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public float getOper1() {
        return oper1;
    }

    public void setOper1(float oper1) {
        this.oper1 = oper1;
    }

    public float getOper2() {
        return oper2;
    }

    public void setOper2(float oper2) {
        this.oper2 = oper2;
    }
    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}
