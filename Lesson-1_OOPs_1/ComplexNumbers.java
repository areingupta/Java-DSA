package problem_2;

public class ComplexNumbers {

    int real;
    int imaginary;

    public ComplexNumbers(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public void plus(ComplexNumbers c2){
        int real = this.real + c2.real;
        int imaginary = this.imaginary + c2.imaginary;
        this.real = real;
        this.imaginary = imaginary;
    }

    public void multiply(ComplexNumbers c2){
        int real = ((this.real*c2.real) - (this.imaginary*c2.imaginary));
        int imaginary = (this.imaginary*c2.real) + (this.real*c2.imaginary);
        this.real = real;
        this.imaginary = imaginary;
    }

    public void print(){
        System.out.print(this.real + " + " + "i" + this.imaginary);
    }

}
