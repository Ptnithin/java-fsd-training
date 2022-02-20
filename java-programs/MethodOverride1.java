class Animal
{
	void display()
	{
		System.out.println(" I am an Animal");
	}
}

class Dog extends Animal
{
	void display()
	{
		System.out.println("I am a Dog");
	}
}

class Cat extends Animal
{
	void display()
	{
		System.out.println("I am a Cat");
	}
}

class 	Flies
{
	void display()
	{
		System.out.println(" I am a fly");
	}
}

class Mosquito extends Flies

{
	void display()
	{
		System.out.println("I am a Mosquito");
	}
}

class MethodOverride1
{
	public static void main(String[] args)
	{
		Animal a;
		a=new Cat();
		a.display();
		a=new Dog();
		a.display();
		Flies f;
		f= new Mosquito();
		f.display();
	}
}
	