package point;

public class Point3D extends Point2D{
	float z;

	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	public float[] getXYZ() {
		return new float[]{this.x,this.y,this.z};
	}
	
	public void setXYZ(float x, float y, float z) {
		setX(x);
		setY(y);
		setZ(z);
	}
}
