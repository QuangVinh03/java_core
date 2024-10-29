package java_core;

public class RightAngledTriangle {
	public static int maxSide(int side1, int side2, int side3) {
		int[] sides = {side1,side2,side3};
		int max = 0;
		for (int i = 0; i < sides.length; i++) {
			if(sides[i]>=max) max = sides[i];
		}
		return max;
	}
	public static boolean isRightAngledTriangle(int side1, int side2, int side3) {
		int[] sides = {side1,side2,side3};
		int hypotenuse = maxSide(side1, side2, side3);
		int squareSum = 0;
		for(int side:sides) {
			if(side!=hypotenuse) squareSum+=side*side;
		}
		return hypotenuse*hypotenuse == squareSum;
	}
	
	public static void main(String[] args) {
		System.out.println(maxSide(2, 1, 3));
		System.out.println(isRightAngledTriangle(1, 4, 5));
	}

}
