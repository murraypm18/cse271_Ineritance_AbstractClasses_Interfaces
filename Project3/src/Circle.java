/*
* Patrick Murray
* CSE 271-C
* Project 3
* Inheritance, Abstract Classes, and Interfaces
*/
public class Circle extends Shape implements Area {

		private double radius;
		
		/**
		 * workhorse constructor
		 * @param radiys
		 * @param name
		 */
		public Circle(double radius, String name)
		{
			super(name); //sets name using super constructor
			this.radius = radius;
		}
		
		/**
		 * returns the area of the circle
		 */
		public double getArea()
		{
			//formula to fine area of circle
			return Math.PI*(Math.pow(radius, 2));
		}
		
		/**
		 * overrides the getName method
		 */
		@Override
		public String getName() {
			return name;
		}
		
		/**
		 * overrides the equals method
		 */
		@Override
		public boolean equals(Object o)
		{
			//checks if object is an instance of circle
			if(!(o instanceof Circle))
				return false;
			
			//sets object to a circle
			Circle c = (Circle)o;
			//checks if it is equal
			return this.getRadius() == c.getRadius() &&
					this.getName().equals(c.getName());
		}
		
		/**
		 * overrides the toString method
		 * @return String
		 */
		public String toString()
		{
			return "Circle [Name: " + name + ", Radius: " + radius + "]";
		}

		/**
		 * @return the radius
		 */
		public double getRadius() {
			return radius;
		}

		/**
		 * @param radius the radius to set
		 */
		public void setRadius(double radius) {
			this.radius = radius;
		}

		
		
}
