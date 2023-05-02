class Person{
	String name;
	String blood;
	void get_data(){System.out.println("Hi "+name+". Your blood type is "+blood+".");}
}
class Child1 extends Person{
	int student_id;
}
class Child2 extends Person{
	String course;
}
class TestInheritance{
public static void main(String[]args){
Child1 a=new Child1();
Child2 b=new Child2();
a.name="Raeyaan";
a.blood="AB";
b.name="Rishon";
System.out.println(a.name);
System.out.println(a.blood);
a.get_data();
System.out.println(b.name);
}
}
