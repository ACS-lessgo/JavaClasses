package dayOne;


public class SingleLevelTest1 
{
	public static void main(String[] args) 
	{
		//Person personObj1=new Person('M',"Ankush",22);
		//Person personObj2=new Person(24);
		//personObj2.showPerson();
		//System.out.println("___________________");
		//personObj1.showPerson();
		//Student studentObj1=new Student('M',"James",22,123,"R V C E","CSE",788);
		//studentObj1.showStudent();
		//System.out.println("___________________");
		//Employee empObj=new Employee();
	}
}


class Person
{
	private char gender;
	private String name;
	private int age;
	
	Person()
	{
		System.out.println("Person() ctor....");
	}
	
	Person(int age){
		this('F',"NoName",24);
	}
	
	Person(char gender, String name, int age)
	{
		if(gender=='M' || gender=='F') 
		{
			this.gender=gender;
		}
		else
		{
			RuntimeException runtimeGenderExp = new RuntimeException("Invalid gender:  "+gender);
			throw runtimeGenderExp;
		}
		if (name.matches("^[a-zA-Z]*$")) 
		{
			this.name=name;
		}
		else
		{
			RuntimeException runtimeNameExp = new RuntimeException("Invalid name: "+name);
			throw runtimeNameExp;
		}
		if(age<100 && age>18)
		{
			this.age=age;
		}
		else
		{
			RuntimeException runtimeAgeExp=new RuntimeException("Invalid age: "+age);
			throw runtimeAgeExp;
		}
	}
	
	void showPerson() 
	{
		System.out.println("<--------Personal Information--------->");
		System.out.println("Gender: "+gender);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		//System.out.println("<------------------------------------->");
	}
}


class Student extends Person
{
	int rollNumber;
	String collegeName;
	String stream;
	private float marks;
	
	
	Student()
	{
		System.out.println("Student() ctor....");
	}
	
	
	Student(char gender, String name, int age,int rollNumber,String collegeName,String stream,int marks)
	{

		super(gender,name,age);
		
		
		if(Validator.checkNumber(rollNumber,1,500))
		{
			this.rollNumber=rollNumber;
		}
		else
		{
			RuntimeException runtimeRollNoExp=new RuntimeException("Invalid Rollno: "+rollNumber);
			throw runtimeRollNoExp;
		}
		
		if(Validator.checkNumber(marks, 1, 1000))
		{
			this.marks=marks;
		}
		else
		{
			RuntimeException runtimeMarksExp=new RuntimeException("Invalid marks: "+marks);
			throw runtimeMarksExp;
		}
		
		if(Validator.checkString(collegeName))
		{
			this.collegeName=collegeName;
		}
		else
		{
			RuntimeException runtimeCollegeExp=new RuntimeException("Invalid CollegeName: "+collegeName);
			throw runtimeCollegeExp;
		}
		
		if(Validator.checkString(stream))
		{
			this.stream=stream;
		}
		else
		{
			RuntimeException runtimeStreamExp=new RuntimeException("Invalid Stream: "+stream);
			throw runtimeStreamExp;
		}
		
	}
	void showStudent() {
		super.showPerson();
		System.out.println("<---------Student---------->");
		System.out.println("RollNo: "+rollNumber);
		System.out.println("College Name: "+collegeName);
		System.out.println("Stream: "+stream);
		System.out.println("Marks: "+marks);
	}
}


class Employee extends Student
{
	private int empNo;
	private String companyName;
	private String designation;
	private float salary;
	
	Employee() 
	{
		System.out.println("Employee() ctor...");
	}
	Employee(char gender, String name, int age,int rollNumber,String collegeName ,String stream,int mark,int empNo,String companyName,String designation,float salary)
	{
		super(gender,name,age,rollNumber , collegeName ,stream,mark);
		
		if(Validator.checkNumber(empNo, 1, 500))
		{
			this.empNo=empNo;
		}
		else
		{
			RuntimeException runtimeEmpNoExp=new RuntimeException("Invalid EmpNo: "+empNo);
			throw runtimeEmpNoExp;
		}
		
		if(Validator.checkString(companyName))
		{
			this.companyName=companyName;
		}
		else
		{
			RuntimeException runtimeCompanyNameExp=new RuntimeException("Invalid CompanyName: "+companyName);
			throw runtimeCompanyNameExp;
		}
		
		if(Validator.checkNumber(salary, 1, 50000))
		{
			this.salary=salary;
		}
		else
		{
			RuntimeException runtimeSalaryExp=new RuntimeException("Invalid Salary: "+salary);
			throw runtimeSalaryExp;
		}
		
		if(Validator.checkString(designation))
		{
			this.designation=designation;
		}
		else
		{
			RuntimeException runtimeCompanyNameExp=new RuntimeException("Invalid Designation: "+designation);
			throw runtimeCompanyNameExp;
		}
		
	}
	public void showEmployee()
	{
		System.out.println("<------------Employee Details---------->");
		System.out.println("Emp Number: "+ empNo);
		System.out.println("Company: "+companyName);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+designation);
	}
}