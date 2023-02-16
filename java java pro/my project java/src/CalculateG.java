public class CalculateG {
    public static double multiplication(double part1, double part2) {
        return part1 * part2;
    }

    public static double square(double part1) {
        return part1* part1;
    }

    public static double summation(double part1, double part2) {
        return part1 + part2;
    }

    public static void outline(String message, double result) {
        System.out.println(message + result);
    }

    public static void main(String[] args) {
        double gravity = -9.81;
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        double type= 0.5;
        System.out.println("The object's position after " + fallingTime + "seconds is " + finalPosition + "m.");
        //Add formulas for position and velocity
        //x(t)=0.5*at^2+vit+xi
        finalPosition = (type * (gravity * fallingTime * fallingTime) + (initialVelocity * fallingTime) + initialPosition) / fallingTime;
        System.out.println("finalposition is:" + finalPosition);
        //v(t)=at+vi
        finalVelocity = gravity * fallingTime / fallingTime;
        //show results
        System.out.println("finalvelocity area:" + finalVelocity);
        double part1 = 55;
        double part2= 20;
        double c = multiplication(part1, part2);
        outline("multiplication: ", c);
        double d = square(part1);
        outline("powering to square: ", d);
        double e = summation(part1, part2);
        outline("summation: ", e);


    }
}