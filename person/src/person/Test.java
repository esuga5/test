package person;

public class Test {

	public static void main(String[]args){

		Person taro = new Person();

		taro.name=" 山田太郎";

		taro.age=20;

		taro.phoneNumber="000-0000-0000";

		taro.address="沖縄";

		Person hanako = new Person();

		hanako.name="鈴木花子";

		hanako.age=16;

		hanako.phoneNumber="000-0000-0001";

		hanako.address="鹿児島";

		Person jiro = new Person();

		jiro.name="木村次郎";

		jiro.age=18;

		jiro.phoneNumber="000-0000-0002";

		jiro.address="大分";

		Person me = new Person();

		me.name="江菅航介";

		me.age=24;

		me.phoneNumber="000-0000-0003";

		me.address="千葉";

		System.out.println(taro.name);

		System.out.println(taro.age);

		System.out.println(taro.phoneNumber);

		System.out.println(taro.address);

		taro.talk();

		taro.walk();

		Robot aibo =new Robot();

		aibo.name="aibo";

		Robot asimo =new Robot();

		asimo.name="asimo";

		Robot pepper= new Robot();

		pepper.name="pepper";

		asimo.talk();

		aibo.run();

		pepper.walk();
	}



}