import java.util.ArrayList;
import java.util.List;

public class ListPractice {

public static void main(String[] args) {

	Person sato=new Person("sato",28);
	Person monzen=new Person("monzen",22);
	Person suzuki=new Person("suzuki",31);

	List<Person>personList=new ArrayList<Person>();

	personList.add(suzuki);
	personList.add(sato);
	personList.add(monzen);

	for(Person p:personList){
		System.out.println(p.getName()+"は"+p.getAge()+"才");
	}

	for(int i=0;i<personList.size();i++){
		System.out.println(i+1+"件目は"+personList.get(i).getName()+"さんです");
	}







	}
}
