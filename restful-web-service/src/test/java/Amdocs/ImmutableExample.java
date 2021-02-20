package Amdocs;

public final class ImmutableExample {
	private final String name;
	private final int id;
	private final Age age;

	ImmutableExample(String name, int id, Age age) {
		this.name = name;
		this.id = id;
		  Age cloneAge = new Age();
		      cloneAge.setDay(age.getDay());
		      cloneAge.setMonth(age.getMonth());
		      cloneAge.setYear(age.getYear());
		      this.age = cloneAge;
		  }

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Age getAge() {
		Age cloneAge = new Age();
	      cloneAge.setDay(this.age.getDay());
	      cloneAge.setMonth(this.age.getMonth());
	      cloneAge.setYear(this.age.getYear());
		return cloneAge;
	}

	public static void main(String[] args) {
		    Age age = new Age();
		    age.setDay(1);
		    age.setMonth(1);
		    age.setYear(1992);
		    ImmutableExample student = new ImmutableExample("Alex",1,  age);
		    System.out.println("Alex age year before modification = " + student.getAge().getYear());
//		    age.setYear(1993);
		    student.getAge().setYear(1993);
		    System.out.println("Alex age year after modification = " + student.getAge().getYear());
		}

}
